package jp.ac.it_college.std.s14006.abstract_factory.tablefactory;

import jp.ac.it_college.std.s14006.abstract_factory.factory.*;
import java.util.Iterator;
/**
 * Created by kabotya on 15/06/11.
 */
public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#CCC\" align=\"center\" colspan\""
                + tray.size() + "\"><b>" + caption + "</b><td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");

        Iterator it = tray.iterator();

        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }

        buffer.append("</tr></table>");
        buffer.append("</td>");

        return buffer.toString();
    }

}
