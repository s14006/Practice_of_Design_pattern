package jp.ac.it_college.std.s14006.flyweight;

import java.util.HashMap;

/**
 * Created by kabotya on 15/06/24.
 */
public class BigCharFactory {

    private HashMap pool = new HashMap();

    private static BigCharFactory singleton = new BigCharFactory();

    public BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar)pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put("" + charname, bc);
        }
        return bc;
    }


}
