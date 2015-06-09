package jp.ac.it_college.std.s14006.singleton;

/**
 * Created by kabotya on 15/06/09.
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("インスタンスを生成しました");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
