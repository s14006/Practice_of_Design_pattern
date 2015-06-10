package jp.ac.it_college.std.s14006.prototype.framework;

/**
 * Created by kabotya on 15/06/10.
 */
public interface Product extends Cloneable {

    public abstract void use(String s);
    public abstract Product createClone();
}
