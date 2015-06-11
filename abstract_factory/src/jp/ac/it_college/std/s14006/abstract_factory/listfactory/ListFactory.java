package jp.ac.it_college.std.s14006.abstract_factory.listfactory;

import jp.ac.it_college.std.s14006.abstract_factory.factory.*;

/**
 * Created by kabotya on 15/06/11.
 */
public class ListFactory extends Factory{

    public Link createLink(String caption,String url) {
        return new ListLink(caption,url);
    }

    public Tray createTray(String caption) {
        return new ListTray(String caption);
    }

    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }

}
