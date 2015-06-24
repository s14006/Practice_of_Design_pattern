package jp.ac.it_college.std.s14006.pdp;

import java.util.*;

import Decorator.FullBorder;
import Decorator.SideBorder;
import Visitor.FileTreatmentException;
import Visitor.ListVisitor;
import jp.ac.it_college.std.s14006.abstract_factory.factory.FactoryMain;
import jp.ac.it_college.std.s14006.adapter.AdapterMain;
import jp.ac.it_college.std.s14006.bridge.BridgeMain;
import jp.ac.it_college.std.s14006.builder.BuilderMain;
import jp.ac.it_college.std.s14006.chain_of_responsibility.*;
import jp.ac.it_college.std.s14006.composite.Directory;
import jp.ac.it_college.std.s14006.composite.File;
import jp.ac.it_college.std.s14006.composite.FileTreamentException;
import jp.ac.it_college.std.s14006.facade.pagemaker.PageMaker;
import jp.ac.it_college.std.s14006.factory_method.FactoryMethodMain;
import jp.ac.it_college.std.s14006.iterator.IteratorMain;
import jp.ac.it_college.std.s14006.mediator.LoginFrame;
import jp.ac.it_college.std.s14006.memento.Gamer;
import jp.ac.it_college.std.s14006.memento.Memento;
import jp.ac.it_college.std.s14006.prototype.PrototypeMain;
import jp.ac.it_college.std.s14006.singleton.SingletonMain;
import jp.ac.it_college.std.s14006.strategy.Hand;
import jp.ac.it_college.std.s14006.strategy.Player;
import jp.ac.it_college.std.s14006.strategy.ProbStrategy;
import jp.ac.it_college.std.s14006.strategy.WinningStrategy;
import jp.ac.it_college.std.s14006.template_method.TemplateMethodMain;
import std.Observer.*;
import std.Observer.Observer;

/**
 * Created by kabotya on 15/06/03.
 */
public class Main {
    public static void main(String[] args) {

        //new IteratorMain();       Chapter1 iterator

        //new AdapterMain();        Chapter2 adapter

        //new TemplateMethodMain(); Chatper3 template_method

        //new FactoryMethodMain();  Chapter4 factory_method

        //new SingletonMain();      Chapter5 singleton

        //new PrototypeMain();      Chapter6 prototype

        //new BuilderMain(new String[] {"html"});   Chapter7 builder

        //new FactoryMain(new String[] {""});   Chapter8 factory

        new BridgeMain();


    }
    public static void Chapter10(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }

        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);

        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();

            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();

            } else {
                System.out.println("Even…");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }

    public static void Chapter11() {

        try {
            System.out.println("Making root entries…");

            Directory rootdir = new Directory("root");
            Directory binder = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");

            rootdir.add(binder);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            binder.add(new File("vi", 10000));
            binder.add(new File("latex", 20000));
            rootdir.printList();

            System.out.println("");
            System.out.println("Making user entries…");

            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");

            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);

            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composize.java", 200));

            hanako.add(new File("memo.txt", 300));

            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));

            rootdir.printList();
        } catch (FileTreamentException e) {
            e.printStackTrace();
        }
    }

    public static void Chapter12() {

        Decorator.Display b1 = new Decorator.StringDisplay("Hello, world.");
        Decorator.Display b2 = new SideBorder(b1, '#');
        Decorator.Display b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();

        Decorator.Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new Decorator.StringDisplay("こんにちは")
                                                ),
                                                '*'
                                        )
                                )
                        ),
                        '/'
                );

        b4.show();
    }

    public static void Chapter13() {

        try {
            System.out.println("Making root entries…");

            Visitor.Directory rootdir = new Visitor.Directory("root");
            Visitor.Directory bindir = new Visitor.Directory("bin");
            Visitor.Directory tmpdir = new Visitor.Directory("tmp");
            Visitor.Directory usrdir = new Visitor.Directory("usr");

            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            bindir.add(new Visitor.File("vi", 10000));
            bindir.add(new Visitor.File("latex", 20000));
            rootdir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("Making user entries…");

            Visitor.Directory yuki = new Visitor.Directory("yuki");
            Visitor.Directory hanako = new Visitor.Directory("hanako");
            Visitor.Directory tomura = new Visitor.Directory("tomura");

            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);

            yuki.add(new Visitor.File("diary.html", 100));
            yuki.add(new Visitor.File("Composite.java", 200));
            hanako.add(new Visitor.File("memo.txt", 300));
            tomura.add(new Visitor.File("game.doc", 400));
            tomura.add(new Visitor.File("junk.mail", 500));

            rootdir.accept(new ListVisitor());

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }

    public static void Chapter14() {

        Support azrs = new NoSupport("azrs");
        Support kabotya = new LimitSupport("kabotya", 100);
        Support cloneko = new SpecialSupport("cloneko", 429);
        Support ito = new LimitSupport("ito", 200);
        Support usathon = new OddSupport("usathon");
        Support usao = new LimitSupport("usao", 300);

        azrs.setNext(kabotya).setNext(cloneko).setNext(ito).setNext(usathon).setNext(usao);

        for (int i = 0; i < 500; i++) {
            azrs.support(new Trouble(i));
        }
    }

    public static void Chapter15() {

        PageMaker.makeWelcomePage("kabotya@kabotya.com", "welcome.html");
    }

    public static void Chapter16() {
        new LoginFrame("Mediator Sample");
    }

    public static void Chapter17() {

        std.Observer.NumberGenerator generator = new std.Observer.RandomNumberGenerator();
        std.Observer.Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }

    public static void Chapter18() {

        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("現状:" + gamer);

            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    (だいぶ増えたので、現在の状態を保存しておこう)    ");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("     (だいぶ減ったので、以前の状態に戻しましょう)    ");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("");
        }
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
