package Visitor;

/**
 * Created by kabotya on 15/06/24.
 */
public class VisitorMain {

    public VisitorMain() {


        try {
            System.out.println("Making root entries…");

            Visitor.Directory rootdir = new Visitor.Directory("root");
            Visitor.Directory bindir = new Visitor.Directory("bin");
            Visitor.Directory tmpdir = new Visitor.Directory("tmp");
            Visitor.Directory usrdir = new Visitor.Directory("usr");

            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            bindir.add(new Visitor.File("vi", 10000));
            bindir.add(new Visitor.File("latex", 20000));
            rootdir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("Making user entries…");

            Visitor.Directory yuki = new Visitor.Directory("yuki");
            Visitor.Directory hanako = new Visitor.Directory("hanako");
            Visitor.Directory tomura = new Visitor.Directory("tomura");

            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);

            yuki.add(new Visitor.File("diary.html", 100));
            yuki.add(new Visitor.File("Composite.java", 200));
            hanako.add(new Visitor.File("memo.txt", 300));
            tomura.add(new Visitor.File("game.doc", 400));
            tomura.add(new Visitor.File("junk.mail", 500));

            rootdir.accept(new ListVisitor());

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
