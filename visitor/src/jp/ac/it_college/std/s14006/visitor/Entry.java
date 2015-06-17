package jp.ac.it_college.std.s14006.visitor;

import java.util.Iterator;

/**
 * Created by kabotya on 15/06/17.
 */
public abstract class Entry implements Element{

    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + " (" + getSize() + ") ";
    }

}
