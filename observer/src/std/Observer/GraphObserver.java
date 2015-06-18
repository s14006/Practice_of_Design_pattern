package std.Observer;


/**
 * Created by kabotya on 15/06/18.
 */
public class GraphObserver implements Observer {

    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver: ");
        int count = generator.getNumber();

        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e){}

    }
}
