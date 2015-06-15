package jp.ac.it_college.std.s14006.pdp;

import java.util.*;

import jp.ac.it_college.std.s14006.abstract_factory.factory.Factory;
import jp.ac.it_college.std.s14006.abstract_factory.factory.Link;
import jp.ac.it_college.std.s14006.abstract_factory.factory.Page;
import jp.ac.it_college.std.s14006.abstract_factory.factory.Tray;
import jp.ac.it_college.std.s14006.adapter.Print;
import jp.ac.it_college.std.s14006.adapter.Print2;
import jp.ac.it_college.std.s14006.adapter.PrintBanner;
import jp.ac.it_college.std.s14006.adapter.PrintBanner2;
import jp.ac.it_college.std.s14006.bridge.CountDisplay;
import jp.ac.it_college.std.s14006.bridge.Display;
import jp.ac.it_college.std.s14006.bridge.StringDisplayImp1;
import jp.ac.it_college.std.s14006.builder.Director;
import jp.ac.it_college.std.s14006.builder.HTMLBuilder;
import jp.ac.it_college.std.s14006.builder.TextBuilder;
import jp.ac.it_college.std.s14006.factory_method.framework.*;
import jp.ac.it_college.std.s14006.factory_method.idcard.IDCardFactory;
import jp.ac.it_college.std.s14006.iterator.Book;
import jp.ac.it_college.std.s14006.iterator.BookShelf;
import jp.ac.it_college.std.s14006.iterator.Iterator;
import jp.ac.it_college.std.s14006.prototype.UnderlinePen;
import jp.ac.it_college.std.s14006.prototype.framework.Manager;
import jp.ac.it_college.std.s14006.prototype.framework.MessageBox;
import jp.ac.it_college.std.s14006.prototype.framework.Product;
import jp.ac.it_college.std.s14006.singleton.Singleton;
import jp.ac.it_college.std.s14006.template_method.AbstractDisplay;
import jp.ac.it_college.std.s14006.template_method.CharDisplay;
import jp.ac.it_college.std.s14006.template_method.StringDisplay;

/**
 * Created by kabotya on 15/06/03.
 */
public class Main {
    public static void main(String[] args) {

        Chapter9();

    }

    public static void Chapter1() {

        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("⊂ミ⊃＾ω＾ ）⊃　ｱｳｱｳ!!"));

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

    public static void Chapter2_1() {

        Print p = new PrintBanner("⊂ミ⊃＾ω＾ ）⊃　ｱｳｱｳ!!");
        p.printWeak();
        p.printStrong();

    }

    public static void Chapter2_2() {

        Print2 p = new PrintBanner2("⊂ミ⊃＾ω＾ ）⊃　ｱｳｱｳ!!");
        p.printWeak();
        p.printStrong();

    }

    public static void Chapter3() {

        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello,World");
        AbstractDisplay d3 = new StringDisplay("こんちは");

        d1.display();
        d2.display();
        d3.display();
    }

    /*
    public static void Chapter4() {

        Factory factory = new IDCardFactory();

        Prodact card1 = factory.create("かぼちゃ");
        Prodact card2 = factory.create("azrs");
        Prodact card3 = factory.create("cloneko");

        card1.use();
        card2.use();
        card3.use();
    }*/

    public static void Chapter5() {

        System.out.println("Start.");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同じインスタンスです");
        } else {
            System.out.println("obj1とobj2は同じインスタンスではありません");
        }

        System.out.println("End.");
    }

    public static void Chapter6() {

        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("Strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box",  sbox);

        Product p1 = manager.create("Strong message");
        p1.use("Hello World");

        Product p2 = manager.create("warning box");
        p2.use("Hello World");

        Product p3 = manager.create("slash box");
        p3.use("Hello World");
    }

    public static void Chapter7(String[] args) {

        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args.equals("plain")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getResult();
            System.out.println(result);

        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "が作成されました");

        } else {
            usage();
            System.exit(0);

        }
    }

    private static void usage() {
        System.out.println("Usage: java Main plain        プレーンテキストで作成");
        System.out.println("Usage: java Main html         HTMLファイルで作成");
    }

    public static void FactoryMain(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");
        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.jp");
        Link excite = factory.createLink("Excite", "http://www.excite.com");
        Link google = factory.createLink("Google", "http://www.google.com");

        Tray traynews = factory.createTray("新聞");
        traynews.add(asahi);
        traynews.add(yomiuri);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("サーチエンジン");
        traysearch.add(traysearch);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage","かぼちゃ");
        page.add(traynews);
        page.add(traysearch);
        page.output();


    }

    public static void Chapter9() {

        Display d1 = new Display(new StringDisplayImp1("Hello, azrs"));
        Display d2 = new CountDisplay(new StringDisplayImp1("Hello, azrs"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImp1("Hello, azrs"));

        d1.dispaly();
        d2.dispaly();
        d3.dispaly();
        d3.multiDisplay(5);
    }


    //配列のやつ
    public static void Arraytest() {

        String[] array = new String[3];

        array[0] = "azrs";
        array[1] = "kabotya";
        array[2] = "cloneko";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void ArrayTest1() {

        ArrayList<String> list = new ArrayList<String>();

        list.add("azrs");
        list.add("kabotya");
        list.add("cloneko");

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }

    public static void ArrayTest2() {

        // 自動的に長くなる配列
        ArrayList<String> list = new ArrayList<String>();

        list.add("azrs");
        list.add("kabotya");
        list.add("cloneko");
        list.add("ito");
        list.add("usathon");

        //削除前の表示
        System.out.println("削除前");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println();

        //azrsとkabotyaとusathonを削除
        list.remove("azrs");
        list.remove("kabotya");
        list.remove("usathon");

        //削除後の表示
        System.out.println("削除後");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println();

        //azrsは含まれているかどうか
        if (list.contains("azrs")) {
            System.out.println("listにazrsは含まれています");
        } else {
            System.out.println("listにazrsは含まれていません");
        }
    }

    public static void ArrayTest3() {
        //JDK 1.4以前のJava
        ArrayList list = new ArrayList();

        list.add("azrs");
        list.add("kabotya");
        list.add("cloneko");
        list.add("ito");
        list.add("usathon");

        for (java.util.Iterator it = list.iterator(); it.hasNext();) {
            String name = (String)it.next();
            System.out.println(name);
        }
    }

    public static void ArrayInteger() {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(34);
        list.add(56);
        list.add(78);
        list.add(90);

        for (int n : list) {
            System.out.println(n);
        }
    }

    public static void LinkedListTest1() {

        LinkedList<String> list = new LinkedList<String>();

        list.add("kabotya");
        list.add("clneko");
        list.add("ito");
        list.add("usathon");

        System.out.println(list);

        list.addFirst("azrs");

        System.out.println(list);
    }

    public static void LinkedListTest2() {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("azrs");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("kabotya");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("cloneko");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("ito");
        System.out.println("offer後のqueue = " + queue);

        while (queue.peek() != null) {

            String name = queue.poll();
            System.out.println("pollの戻り値   = " + name);
            System.out.println("poll後のqueue  = " + queue);
        }
    }

    public static void LinkedListTest3() {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("azrs");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("kabotya");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("cloneko");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("ito");
        System.out.println("offer後のqueue = " + queue);

        try {
            while (true) {
                String name = queue.element();
                System.out.println("elementの戻り値 = " + name);

                name = queue.remove();
                System.out.println("removeの戻り値  = " + name);
                System.out.println("remove後のqueue = " + queue);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public static void LinkedListTest4() {

        LinkedList<String> stack = new LinkedList<String>();

        stack.addFirst("azrs");
        System.out.println("addFirst後のstack = " + stack);
        stack.addFirst("kabotya");
        System.out.println("addFirst後のstack = " + stack);
        stack.addFirst("cloneko");
        System.out.println("addFirst後のstack = " + stack);
        stack.addFirst("ito");
        System.out.println("addFirst後のstack = " + stack);
        stack.addFirst("usathon");
        System.out.println("addFirst後のstack = " + stack);

        try {

            while (true) {
                String name = stack.getFirst();
                System.out.println("getFirstの戻り値 = " + name);

                name = stack.removeFirst();
                System.out.println("removeFirstの戻り値  = " + name);
                System.out.println("removeFirst後のstack = " + stack);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public static void HashSetTest1() {

        Set<String> set = new HashSet<String>();

        set.add("azrs");
        set.add("kabotya");
        set .add("cloneko");
        set.add("ito");
        set.add("usathon");

        for (String name : set) {
            System.out.println(name);
        }

        if (set.contains("azrs")) {
            System.out.println("setにazrsは含まれています");
        } else {
            System.out.println("setにazrsは含まれていません");
        }
    }

    public static void HashMapTest() {

        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("azrs",100);
        map.put("kabotya",57);
        map.put("cloneko",85);
        map.put("ito",85);
        map.put("usathon", 92);

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println();

        //キーに関する拡張forループ
        for (String name : map.keySet()) {
            System.out.println(name);
        }
        System.out.println();

        //値に関する拡張forループ
        for (int value : map.values()) {
            System.out.println(value);
        }
        System.out.println();

        //キーに関する拡張forループで値も得る
        for (String name : map.keySet()) {
            System.out.println(name + " => " + map.get(name));
        }
        System.out.println();

        //キーkabotyaの値を得る
        System.out.println("kabotyaの値 = " + map.get("kabotya"));

        //キーkabosuの値を得る
        System.out.println("kabosuの値 = " + map.get("kabosu"));

    }
}
