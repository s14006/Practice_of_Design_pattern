package jp.ac.it_college.std.s14006.chain_of_responsibility;

/**
 * Created by kabotya on 15/06/17.
 */
public class Trouble {

    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "[Trouble " + number + "]";
    }
}
