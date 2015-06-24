package jp.ac.it_college.std.s14006.bridge;

/**
 * Created by kabotya on 15/06/24.
 */
public class BridgeMain {

    public BridgeMain() {
        Display d1 = new Display(new StringDisplayImp1("Hello, azrs"));
        Display d2 = new CountDisplay(new StringDisplayImp1("Hello, azrs"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImp1("Hello, azrs"));

        d1.dispaly();
        d2.dispaly();
        d3.dispaly();
        d3.multiDisplay(5);
    }
}
