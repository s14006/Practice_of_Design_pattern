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


    /*  --- lesson19-1 ---
        String[] array = new String[3];

        array[0] = "azrs";
        array[1] = "kabotya";
        array[2] = "cloneko";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        */

        // 自動的に長くなる配列
        ArrayList<String> list = new ArrayList<String>();

        list.add("azrs");
        list.add("kabotya");
        list.add("cloneko");
        list.add("ito");
        list.add("usathon");

        for (java.util.Iterator<String> it = list.iterator(); it.hasNext();) {
            String name = it.next();
            System.out.println(name);
        }




    }
}
