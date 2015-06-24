package jp.ac.it_college.std.s14006.appendix;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by kabotya on 15/06/18.
 */
public class SerialTest extends Frame implements WindowListener{

    private Label left;
    private Label right;

    public SerialTest() {
        super("Serial text");
        addWindowListener(this);

        setBackground(Color.lightGray);
        setLayout(new GridLayout(1, 2));
        left.setBackground(Color.lightGray);
        right.setBackground(Color.lightGray);
        left = new Label("左");
        right = new Label("右");

        add(left);
        add(right);

        pack();
        show();
    }

    public void changeLeft() {
        if (left.getBackground() == Color.blue) {
            left.setBackground(Color.lightGray);
        } else {
            left.setBackground(Color.blue);
        }
    }

    public void changeRight() {
        if (right.getBackground() == Color.red) {
            right.setBackground(Color.lightGray);
        } else {
            right.setBackground(Color.red);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    /*

    public static void main(String...args) {
        SerialTest text = new SerialTest();
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {}
            text.changeLeft();
        }
    }

    */
}


