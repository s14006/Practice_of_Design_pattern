package jp.ac.it_college.std.s14006.chain_of_responsibility;

/**
 * Created by kabotya on 15/06/17.
 */
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
