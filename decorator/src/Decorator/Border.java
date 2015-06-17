package Decorator;

/**
 * Created by kabotya on 15/06/17.
 */
public abstract class Border extends Display {

    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
