package jp.ac.it_college.std.s14006.decorator;

/**
 * Created by kabotya on 15/06/17.
 */
public abstract class Border extends Display {

    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
