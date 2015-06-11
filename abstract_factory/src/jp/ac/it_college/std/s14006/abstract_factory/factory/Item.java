package jp.ac.it_college.std.s14006.abstract_factory.factory;

/**
 * Created by kabotya on 15/06/11.
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
