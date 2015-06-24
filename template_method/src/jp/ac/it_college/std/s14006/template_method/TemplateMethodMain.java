package jp.ac.it_college.std.s14006.template_method;

/**
 * Created by kabotya on 15/06/24.
 */
public class TemplateMethodMain {

    public TemplateMethodMain() {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello,World");
        AbstractDisplay d3 = new StringDisplay("kabotya");

        d1.display();
        d2.display();
        d3.display();
    }
}
