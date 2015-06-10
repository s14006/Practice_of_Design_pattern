package jp.ac.it_college.std.s14006.prototype.framework;

import java.util.*;
/**
 * Created by kabotya on 15/06/10.
 */
public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String protoname) {
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
