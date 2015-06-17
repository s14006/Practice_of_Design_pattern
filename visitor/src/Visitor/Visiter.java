package Visitor;

/**
 * Created by kabotya on 15/06/17.
 */
public abstract class Visiter {

    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
