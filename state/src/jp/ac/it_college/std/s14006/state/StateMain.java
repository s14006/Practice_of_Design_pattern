package jp.ac.it_college.std.s14006.state;

/**
 * Created by kabotya on 15/06/24.
 */
public class StateMain {

    public StateMain() {
        SafeFrame frame = new SafeFrame("State sample");

        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }
    }
}
