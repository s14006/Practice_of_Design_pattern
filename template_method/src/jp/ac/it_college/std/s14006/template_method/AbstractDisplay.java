package jp.ac.it_college.std.s14006.template_method;

/**
 * Created by kabotya on 15/06/09.
 */
public abstract class AbstractDisplay {

    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {

        open();

        for (int i = 0; i < 5; i++) {
            print();
        }

        close();
    }
}
