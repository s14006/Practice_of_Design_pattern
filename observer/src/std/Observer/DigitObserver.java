package std.Observer;

/**
 * Created by kabotya on 15/06/18.
 */
public class DigitObserver implements Observer {

    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver: " + generator.getNumber());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
    }
}
