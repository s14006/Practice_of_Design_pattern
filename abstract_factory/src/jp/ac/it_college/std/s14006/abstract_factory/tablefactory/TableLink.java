package jp.ac.it_college.std.s14006.abstract_factory.tablefactory;

import jp.ac.it_college.std.s14006.abstract_factory.factory.*;
/**
 * Created by kabotya on 15/06/11.
 */
public class TableLink extends Link {

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
