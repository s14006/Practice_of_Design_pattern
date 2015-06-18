package jp.ac.it_college.std.s14006.memento;

import java.util.*;

/**
 * Created by kabotya on 15/06/18.
 */
public class Memento {

    int money;
    ArrayList fruits;

    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List getFruits() {
        return (List)fruits.clone();
    }
}
