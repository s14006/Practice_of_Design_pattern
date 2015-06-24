package jp.ac.it_college.std.s14006.adapter;

/**
 * Created by kabotya on 15/06/24.
 */
public class AdapterMain {

    public AdapterMain() {
        Print p = new PrintBanner("⊂ミ⊃＾ω＾ ）⊃　ｱｳｱｳ!!");
        p.printWeak();
        p.printStrong();

        System.out.println("---");

        Print2 p2 = new PrintBanner2("⊂ミ⊃＾ω＾ ）⊃　ｱｳｱｳ!!");
        p2.printWeak();
        p2.printStrong();
    }
}
