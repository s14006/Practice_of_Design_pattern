package jp.ac.it_college.std.s14006.command.drawer;

import jp.ac.it_college.std.s14006.command.command.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by kabotya on 15/06/25.
 */
public class DrawCanvas extends Canvas implements Drawable {

    private Color color = Color.red;

    private int radius = 6;

    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    public void print(Graphics g) {
        history.execute();
    }

    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius ,radius * 2, radius *2);
    }
}
