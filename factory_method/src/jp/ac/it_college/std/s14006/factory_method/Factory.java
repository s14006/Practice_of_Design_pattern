package jp.ac.it_college.std.s14006.factory_method;
package framework;

/**
 * Created by kabotya on 15/06/09.
 */
public abstract class Factory {

    public final Prodact create(String owner) {
        Prodact p = createProduct(owner);
        registerProduct(p);
    }

    protected abstract Prodact createProduct(String owner);

    protected abstract void registerProduct(Prodact prodact);
}
