package jp.ac.it_college.std.s14006.abstract_factory.listfactory;

import jp.ac.it_college.std.s14006.abstract_factory.factory.*;
/**
 * Created by kabotya on 15/06/11.
 */
public class ListTray extends Tray{

    public ListTray(String caption) {
        super(caption);
    }

    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Integer it = tray.iterator();

        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n");
        buffer.append("<li>\n");

        return buffer.toString();
    }
}
