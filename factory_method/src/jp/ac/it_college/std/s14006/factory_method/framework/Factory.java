package jp.ac.it_college.std.s14006.factory_method.framework;

/**
 * Created by kabotya on 15/06/09.
 */
public abstract class Factory {

    public final Prodact create(String owner) {
        Prodact p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Prodact createProduct(String owner);

    protected abstract void registerProduct(Prodact prodact);
}
