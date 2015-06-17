package jp.ac.it_college.std.s14006.composite;

/**
 * Created by kabotya on 15/06/17.
 */
public class File extends Entry {

    private String name;
    private int size;

    public Filr(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
