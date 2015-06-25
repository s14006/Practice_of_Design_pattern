package jp.ac.it_college.std.s14006.proxy;

/**
 * Created by kabotya on 15/06/25.
 */
public class ProxyMain {

    public ProxyMain() {
        Printable p = new PrinterProxy("kabotya");
        System.out.println("名前は現在" + p.getPrinterName() + "です");
        p.setPrinterName("azrs");
        System.out.println("名前は現在" + p.getPrinterName() + "です");
        p.print("Hello, world");
    }
}
