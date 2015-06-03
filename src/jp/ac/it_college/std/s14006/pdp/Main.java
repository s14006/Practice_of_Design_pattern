package jp.ac.it_college.std.s14006.pdp;

import java.util.*;
import jp.ac.it_college.std.s14006.adapter.Print;
import jp.ac.it_college.std.s14006.adapter.Print2;
import jp.ac.it_college.std.s14006.adapter.PrintBanner;
import jp.ac.it_college.std.s14006.adapter.PrintBanner2;
import jp.ac.it_college.std.s14006.iterator.Book;
import jp.ac.it_college.std.s14006.iterator.BookShelf;
import jp.ac.it_college.std.s14006.iterator.Iterator;
/**
 * Created by kabotya on 15/06/03.
 */
public class Main {
    public static void main(String[] ages) {

    /*  --- Chapter 1 ---
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
        */

    /*  --- Chapter2-1 ---
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
        */

    /*  --- Chapter2-2 ---
        Print2 p = new PrintBanner2("⊂ミ⊃＾ω＾ ）⊃　ｱｳｱｳ!!");
        p.printWeak();
        p.printStrong();
        */

    //    Arraytest();          lesson19-1

    //    ArrayTest1();         lesson19-2

    //    ArrayTest2();         lesson19-2~

    //    ArrayTest3();         lesson19-6

    //    ArrayInteger();       lesson19-7

    //    LinkedListTest1();    lesson19-10

    //    LinkedListTest2();    lesson19-11

    //    LinkedListTest3();    lesson19-12

        LinkedListTest4();
    }

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

        for (int i = 0; i < list.size(); i++) {
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
}
