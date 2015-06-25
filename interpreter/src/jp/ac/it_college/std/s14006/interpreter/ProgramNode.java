package jp.ac.it_college.std.s14006.interpreter;

/**
 * Created by kabotya on 15/06/25.
 */
public class ProgramNode extends Node {

    private Node commandListNode;

    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
