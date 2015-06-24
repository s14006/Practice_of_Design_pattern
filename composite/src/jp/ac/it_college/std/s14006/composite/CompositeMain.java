package jp.ac.it_college.std.s14006.composite;

/**
 * Created by kabotya on 15/06/24.
 */
public class CompositeMain {
    public CompositeMain() {

        try {
            System.out.println("Making root entries…");

            Directory rootdir = new Directory("root");
            Directory binder = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");

            rootdir.add(binder);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            binder.add(new File("vi", 10000));
            binder.add(new File("latex", 20000));
            rootdir.printList();

            System.out.println("");
            System.out.println("Making user entries…");

            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");

            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);

            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composize.java", 200));

            hanako.add(new File("memo.txt", 300));

            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));

            rootdir.printList();
        } catch (FileTreamentException e) {
            e.printStackTrace();
        }
    }
}
