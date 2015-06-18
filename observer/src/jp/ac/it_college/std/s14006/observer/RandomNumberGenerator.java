package jp.ac.it_college.std.s14006.observer;

import java.util.Random;

/**
 * Created by kabotya on 15/06/18.
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;

    public int getNumber() {
        return number;
    }

    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
