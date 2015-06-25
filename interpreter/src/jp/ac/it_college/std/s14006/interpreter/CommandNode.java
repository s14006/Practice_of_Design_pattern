package jp.ac.it_college.std.s14006.interpreter;

/**
 * Created by kabotya on 15/06/25.
 */
public class CommandNode extends Node {

    private Node node;

    public void parse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    public String toString() {
        return node.toString();
    }
}
