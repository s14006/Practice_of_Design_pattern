package jp.ac.it_college.std.s14006.abstract_factory;

/**
 * Created by kabotya on 15/06/11.
 */
public abstract class Link extends Item{

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
