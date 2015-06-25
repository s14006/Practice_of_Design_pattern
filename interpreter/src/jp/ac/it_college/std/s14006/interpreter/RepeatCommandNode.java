package jp.ac.it_college.std.s14006.interpreter;

import java.util.ConcurrentModificationException;

/**
 * Created by kabotya on 15/06/25.
 */
public class RepeatCommandNode extends Node {

    private int number;
    private Node commandListNode;

    public void parse(Context context) throws ParseException {
        context.slipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
