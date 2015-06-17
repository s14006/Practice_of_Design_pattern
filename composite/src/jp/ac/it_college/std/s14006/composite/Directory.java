package jp.ac.it_college.std.s14006.composite;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * Created by kabotya on 15/06/17.
 */
public class Directory extends Entry{

    private String name;
    private ArrayList directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator( );

        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }

        return size;
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();

        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}