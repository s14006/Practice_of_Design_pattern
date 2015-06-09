package jp.ac.it_college.std.s14006.factory_method.idcard;

import jp.ac.it_college.std.s14006.factory_method.framework.*;
import java.util.*;

/**
 * Created by kabotya on 15/06/09.
 */
public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    protected Prodact createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Prodact prodact) {
        owners.add(((IDCard)prodact).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
