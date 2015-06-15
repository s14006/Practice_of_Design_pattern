package jp.ac.it_college.std.s14006.bridge;

/**
 * Created by kabotya on 15/06/15.
 */
public class CountDisplay extends Display{

    public CountDisplay(DisplayImp1 imp1) {
        super(imp1);
    }

    public void multiDisplay(int items) {
        open();

        for (int i = 0; i < items; i++) {
            print();
        }

        close();
    }
}
