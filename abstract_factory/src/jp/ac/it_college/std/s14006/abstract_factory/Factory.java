package jp.ac.it_college.std.s14006.abstract_factory;

/**
 * Created by kabotya on 15/06/11.
 */
public abstract class Factory {

    public static Factory getFactory(String classname) {
        Factory factory = null;

        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("クラス" + classname + "が見つかりません");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
