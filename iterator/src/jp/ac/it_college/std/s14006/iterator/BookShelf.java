package jp.ac.it_college.std.s14006.iterator;

/**
 * Created by kabotya on 15/06/03.
 */
public class BookShelf implements Aggregate{

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getlength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
