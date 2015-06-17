package Visitor;

import java.util.Iterator;

/**
 * Created by kabotya on 15/06/17.
 */
public class ListVisitor extends Visiter {

    private String currentdir = "";

    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory.getName());

        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();

        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }

        currentdir = savedir;
    }
}
