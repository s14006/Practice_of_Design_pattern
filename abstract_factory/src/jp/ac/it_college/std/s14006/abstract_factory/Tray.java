package jp.ac.it_college.std.s14006.abstract_factory;

import java.util.ArrayList;
/**
 * Created by kabotya on 15/06/11.
 */
public abstract class Tray extends Item{

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }

}
