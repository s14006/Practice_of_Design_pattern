package jp.ac.it_college.std.s14006.strategy;

/**
 * Created by kabotya on 15/06/17.
 */
public interface Strategy {

    public abstract Hand nextHand();

    public abstract void study(boolean win);
}
