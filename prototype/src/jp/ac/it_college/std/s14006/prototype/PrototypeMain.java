package jp.ac.it_college.std.s14006.prototype;

import jp.ac.it_college.std.s14006.prototype.framework.*;

/**
 * Created by kabotya on 15/06/24.
 */
public class PrototypeMain {

    public PrototypeMain() {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("Strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box",  sbox);

        Product p1 = manager.create("Strong message");
        p1.use("Hello World");

        Product p2 = manager.create("warning box");
        p2.use("Hello World");

        Product p3 = manager.create("slash box");
        p3.use("Hello World");
    }
}
