package jp.ac.it_college.std.s14006.composite;

/**
 * Created by kabotya on 15/06/17.
 */
public abstract class Entry {

    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreamentException {
        throw new FileTreamentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ") ";
    }
}
