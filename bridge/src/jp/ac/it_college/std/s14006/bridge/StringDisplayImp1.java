package jp.ac.it_college.std.s14006.bridge;

/**
 * Created by kabotya on 15/06/15.
 */
public class StringDisplayImp1 extends DisplayImp1 {

    private String string;
    private int width;

    public StringDisplayImp1(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void rawOpen() {
        printLine();
    }

    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");

        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }

        System.out.println("+");
    }

}
