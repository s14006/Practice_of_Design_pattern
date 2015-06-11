package jp.ac.it_college.std.s14006.abstract_factory.tablefactory;

import jp.ac.it_college.std.s14006.abstract_factory.factory.*;
/**
 * Created by kabotya on 15/06/11.
 */
public class TableFactory extends Factory {

    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
