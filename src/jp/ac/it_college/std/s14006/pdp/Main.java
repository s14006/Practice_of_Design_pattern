package jp.ac.it_college.std.s14006.pdp;

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

        Print2 p = new PrintBanner2("Hello");
        p.printWeak();
        p.printStrong();
    }
}
