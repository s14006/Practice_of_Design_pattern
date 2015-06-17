package jp.ac.it_college.std.s14006.strategy;

import java.util.Random;

/**
 * Created by kabotya on 15/06/17.
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }

        return prevHand;
    }

    public void study(boolean win) {
        won = win;
    }
}
