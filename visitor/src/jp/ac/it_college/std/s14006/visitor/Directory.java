package jp.ac.it_college.std.s14006.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by kabotya on 15/06/17.
 */
public class Directory extends Entry {

    private String name;
    private ArrayList dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;
        Iterator it = dir.iterator();

        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    public Iterator iterator() {
        return dir.iterator();
    }

    public void accept(Visiter v) {
        v.visit(this);
    }
}
