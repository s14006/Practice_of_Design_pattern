package jp.ac.it_college.std.s14006.flyweight;

/**
 * Created by kabotya on 15/06/24.
 */
public class FlyweightMain {

    public FlyweightMain(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
