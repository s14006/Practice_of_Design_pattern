package jp.ac.it_college.std.s14006.template_method;

/**
 * Created by kabotya on 15/06/09.
 */
public class CharDisplay {

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    public void open() {
        System.out.print("<<");
    }

    public void print() {
        System.out.print(ch);
    }

    public void close() {
        System.out.print(">>");
    }
}
