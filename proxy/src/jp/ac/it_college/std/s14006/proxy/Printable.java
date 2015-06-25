package jp.ac.it_college.std.s14006.proxy;

/**
 * Created by kabotya on 15/06/25.
 */
public interface Printable {

    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
    }
}
