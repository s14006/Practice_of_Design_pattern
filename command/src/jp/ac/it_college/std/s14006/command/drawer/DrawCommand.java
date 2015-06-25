package jp.ac.it_college.std.s14006.command.drawer;

import jp.ac.it_college.std.s14006.command.command.Command;
import java.awt.Point;

/**
 * Created by kabotya on 15/06/25.
 */
public class DrawCommand implements Command {

    protected Drawable drawable;

    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    public void execute() {
        drawable.draw(position.x, position.y);
    }

}
