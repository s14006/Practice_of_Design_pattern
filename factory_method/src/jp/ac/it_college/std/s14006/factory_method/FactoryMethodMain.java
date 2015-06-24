package jp.ac.it_college.std.s14006.factory_method;

import jp.ac.it_college.std.s14006.factory_method.framework.*;
import jp.ac.it_college.std.s14006.factory_method.idcard.IDCardFactory;

/**
 * Created by kabotya on 15/06/24.
 */
public class FactoryMethodMain {

    public FactoryMethodMain() {

        Factory factory = new IDCardFactory();

        Prodact card1 = factory.create("かぼちゃ");
        Prodact card2 = factory.create("azrs");
        Prodact card3 = factory.create("cloneko");

        card1.use();
        card2.use();
        card3.use();
    }
}
