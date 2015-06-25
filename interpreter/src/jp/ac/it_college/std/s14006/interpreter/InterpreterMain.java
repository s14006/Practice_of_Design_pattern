package jp.ac.it_college.std.s14006.interpreter;

import java.util.*;
import java.io.*;

/**
 * Created by kabotya on 15/06/25.
 */
public class InterpreterMain {

    public InterpreterMain() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("program.txt"));
            String text;

            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
