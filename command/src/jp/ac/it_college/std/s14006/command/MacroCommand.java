package jp.ac.it_college.std.s14006.command;

import java.util.Stack;
import java.util.Iterator;

/**
 * Created by kabotya on 15/06/25.
 */
public class MacroCommand implements Command {

    private Stack commands = new Stack();

    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command)it.next()).execute();
        }
    }
}
