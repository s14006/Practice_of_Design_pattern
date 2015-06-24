package jp.ac.it_college.std.s14006.singleton;

/**
 * Created by kabotya on 15/06/24.
 */
public class SingletonMain {

    public SingletonMain() {
        System.out.println("Start.");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同じインスタンスです");
        } else {
            System.out.println("obj1とobj2は同じインスタンスではありません");
        }

        System.out.println("End.");
    }
}
