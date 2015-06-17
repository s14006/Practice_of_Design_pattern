package jp.ac.it_college.std.s14006.visitor;

/**
 * Created by kabotya on 15/06/17.
 */
public interface Element {

    public abstract void accept(Visiter v);
}
