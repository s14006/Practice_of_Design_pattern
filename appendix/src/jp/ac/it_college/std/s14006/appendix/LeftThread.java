package jp.ac.it_college.std.s14006.appendix;

/**
 * Created by kabotya on 15/06/18.
 */
public class LeftThread extends Thread {

    private int sleepTime;
    private TestFrame frame;

    public LeftThread(int sleepTime){
        this.sleepTime = sleepTime;
    }

    @Override
    public void run(){
        while (true) {

            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {

            }

        }
    }
}
