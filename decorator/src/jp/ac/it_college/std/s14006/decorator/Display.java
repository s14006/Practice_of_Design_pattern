package jp.ac.it_college.std.s14006.decorator;

/**
 * Created by kabotya on 15/06/17.
 */
public abstract class Display {

    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
