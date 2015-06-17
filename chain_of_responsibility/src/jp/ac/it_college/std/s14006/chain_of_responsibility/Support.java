package jp.ac.it_college.std.s14006.chain_of_responsibility;

/**
 * Created by kabotya on 15/06/17.
 */
public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }
}
