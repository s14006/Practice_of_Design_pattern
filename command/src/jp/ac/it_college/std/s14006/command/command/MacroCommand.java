package jp.ac.it_college.std.s14006.command.command;

import jp.ac.it_college.std.s14006.command.command.Command;

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

    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
