package jp.ac.it_college.std.s14006.abstract_factory.listfactory;

import jp.ac.it_college.std.s14006.abstract_factory.factory.*;
/**
 * Created by kabotya on 15/06/11.
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    public String makeHTML() {
        return "    <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
