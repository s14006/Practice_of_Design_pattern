package jp.ac.it_college.std.s14006.chain_of_responsibility;

/**
 * Created by kabotya on 15/06/17.
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
