package jp.ac.it_college.std.s14006.interpreter;

/**
 * Created by kabotya on 15/06/25.
 */
public class PrimitiveCommandNode extends Node {

    private String name;

    public void parse(Contxt contxt) throws ParseException {
        name = contxt.currentToken();
        contxt.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + "is undefined");
        }
    }

    public String toString() {
        return name;
    }
}
