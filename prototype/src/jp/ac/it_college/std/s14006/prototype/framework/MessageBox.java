package jp.ac.it_college.std.s14006.prototype.framework;

/**
 * Created by kabotya on 15/06/10.
 */
public class MessageBox implements Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    public void use(String s) {
        int length = s.getBytes().length;

        for (int i = 0; i < length; i++) {
            System.out.print(decochar);
        }

        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);

        for (int i = 0; i < length; i++) {
            System.out.print(decochar);
        }

        System.out.println("");
    }

    public Product createClone() {
        Product p = null;

        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
