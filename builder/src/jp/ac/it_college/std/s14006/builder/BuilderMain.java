package jp.ac.it_college.std.s14006.builder;

import static oracle.jrockit.jfr.tools.ConCatRepository.usage;

/**
 * Created by kabotya on 15/06/24.
 */
public class BuilderMain {

    public BuilderMain(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args.equals("plain")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getResult();
            System.out.println(result);

        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "が作成されました");

        } else {
            usage();
            System.exit(0);

        }
    }


}
