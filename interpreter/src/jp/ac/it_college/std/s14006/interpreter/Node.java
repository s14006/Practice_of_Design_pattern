package jp.ac.it_college.std.s14006.interpreter;


/**
 * Created by kabotya on 15/06/25.
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
