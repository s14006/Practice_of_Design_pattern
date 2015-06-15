package jp.ac.it_college.std.s14006.bridge;

/**
 * Created by kabotya on 15/06/15.
 */
public class Display {

    private DisplayImp imp1;

    public Display(DisplayImp imp1) {
        this.imp1 = imp1;
    }

    public void open() {
        imp1.rawOpen();
    }

    public void print() {
        imp1.rawPrint();
    }

    public void close() {
        imp1.rawClose();
    }

    public final void dispaly() {
        open();
        print();
        close();
    }
}
