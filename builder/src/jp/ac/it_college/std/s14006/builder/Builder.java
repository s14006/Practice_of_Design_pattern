package jp.ac.it_college.std.s14006.builder;

/**
 * Created by kabotya on 15/06/10.
 */
public abstract class Builder {

    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
