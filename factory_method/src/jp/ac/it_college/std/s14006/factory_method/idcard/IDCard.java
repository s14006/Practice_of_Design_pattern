package jp.ac.it_college.std.s14006.factory_method.idcard;

import jp.ac.it_college.std.s14006.factory_method.framework.*;

/**
 * Created by kabotya on 15/06/09.
 */
public class IDCard extends Prodact {

    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります");
        this.owner = owner;
    }

    public void use() {
        System.out.println(owner + "のカードを使います");
    }

    public String getOwner() {
        return owner;
    }
}
