package std.Observer;

/**
 * Created by kabotya on 15/06/24.
 */
public class ObserverMain {

    public ObserverMain() {
        std.Observer.NumberGenerator generator = new std.Observer.RandomNumberGenerator();
        std.Observer.Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
