package jp.ac.it_college.std.s14006.visitor;

/**
 * Created by kabotya on 15/06/17.
 */
public abstract class Visiter {

    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
