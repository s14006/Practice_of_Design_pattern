package jp.ac.it_college.std.s14006.pdp;

import java.util.*;

import Decorator.DecoratorMain;
import Visitor.VisitorMain;
import jp.ac.it_college.std.s14006.abstract_factory.factory.FactoryMain;
import jp.ac.it_college.std.s14006.adapter.AdapterMain;
import jp.ac.it_college.std.s14006.bridge.BridgeMain;
import jp.ac.it_college.std.s14006.builder.BuilderMain;
import jp.ac.it_college.std.s14006.chain_of_responsibility.ChainOfResponsibilityMain;
import jp.ac.it_college.std.s14006.command.CommandMain;
import jp.ac.it_college.std.s14006.composite.CompositeMain;
import jp.ac.it_college.std.s14006.facade.pagemaker.FacadeMain;
import jp.ac.it_college.std.s14006.factory_method.FactoryMethodMain;
import jp.ac.it_college.std.s14006.flyweight.FlyweightMain;
import jp.ac.it_college.std.s14006.iterator.IteratorMain;
import jp.ac.it_college.std.s14006.mediator.MeduatorMain;
import jp.ac.it_college.std.s14006.memento.MementoMain;
import jp.ac.it_college.std.s14006.prototype.PrototypeMain;
import jp.ac.it_college.std.s14006.proxy.ProxyMain;
import jp.ac.it_college.std.s14006.singleton.SingletonMain;
import jp.ac.it_college.std.s14006.state.StateMain;
import jp.ac.it_college.std.s14006.strategy.StrategyMain;
import jp.ac.it_college.std.s14006.template_method.TemplateMethodMain;
import std.Observer.ObserverMain;

/**
 * Created by kabotya on 15/06/03.
 */
public class Main {
    public static void main(String[] args) {

        //new IteratorMain();                       Chapter1 iterator

        //new AdapterMain();                        Chapter2 adapter

        //new TemplateMethodMain();                 Chatper3 template_method

        //new FactoryMethodMain();                  Chapter4 factory_method

        //new SingletonMain();                      Chapter5 singleton

        //new PrototypeMain();                      Chapter6 prototype

        //new BuilderMain(new String[] {"html"});   Chapter7 builder

        //new FactoryMain(new String[] {""});       Chapter8 factory

        //new BridgeMain();                         Chapter9 bridge

        //new StrategyMain(new String[] {"auau"});  Chapter10 storategy

        //new CompositeMain();                      Chapter11 composite

        //new DecoratorMain();                      Chapter12 decorator

        //new VisitorMain();                        Chapter13 visitor

        //new ChainOfResponsibilityMain();          Chapter14 chain_of_responsbility

        //new FacadeMain();                         Chapter15 facade

        //new MeduatorMain();                       Chapter16 meduator

        //new ObserverMain();                       Chapter17 observer

        //new MementoMain();                        Chapter18 memento

        //new StateMain();                          Chapter19 state

        //new FlyweightMain(new String[] {"1"} );   Chapter20 flyweight

        //new ProxyMain();                          Chapter21 proxy

        new CommandMain("Command Pattern Sample");

    }

    //配列のやつ
    public static void Arraytest() {

        String[] array = new String[3];

        array[0] = "azrs";
        array[1] = "kabotya";
        array[2] = "cloneko";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }



    public static void ArrayTest1() {

        ArrayList<String> list = new ArrayList<String>();

        list.add("azrs");
        list.add("kabotya");
        list.add("cloneko");

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }



    public static void ArrayTest2() {

        // 自動的に長くなる配列
        ArrayList<String> list = new ArrayList<String>();

        list.add("azrs");
        list.add("kabotya");
        list.add("cloneko");
        list.add("ito");
        list.add("usathon");

        //削除前の表示
        System.out.println("削除前");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println();

        //azrsとkabotyaとusathonを削除
        list.remove("azrs");
        list.remove("kabotya");
        list.remove("usathon");

        //削除後の表示
        System.out.println("削除後");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println();

        //azrsは含まれているかどうか
        if (list.contains("azrs")) {
            System.out.println("listにazrsは含まれています");
        } else {
            System.out.println("listにazrsは含まれていません");
        }
    }

    public static void ArrayTest3() {
        //JDK 1.4以前のJava
        ArrayList list = new ArrayList();

        list.add("azrs");
        list.add("kabotya");
        list.add("cloneko");
        list.add("ito");
        list.add("usathon");

        for (java.util.Iterator it = list.iterator(); it.hasNext();) {
            String name = (String)it.next();
            System.out.println(name);
        }
    }

    public static void ArrayInteger() {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(34);
        list.add(56);
        list.add(78);
        list.add(90);

        for (int n : list) {
            System.out.println(n);
        }
    }

    public static void LinkedListTest1() {

        LinkedList<String> list = new LinkedList<String>();

        list.add("kabotya");
        list.add("clneko");
        list.add("ito");
        list.add("usathon");

        System.out.println(list);

        list.addFirst("azrs");

        System.out.println(list);
    }

    public static void LinkedListTest2() {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("azrs");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("kabotya");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("cloneko");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("ito");
        System.out.println("offer後のqueue = " + queue);

        while (queue.peek() != null) {

            String name = queue.poll();
            System.out.println("pollの戻り値   = " + name);
            System.out.println("poll後のqueue  = " + queue);
        }
    }

    public static void LinkedListTest3() {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("azrs");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("kabotya");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("cloneko");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("ito");
        System.out.println("offer後のqueue = " + queue);

        try {
            while (true) {
                String name = queue.element();
                System.out.println("elementの戻り値 = " + name);

                name = queue.remove();
                System.out.println("removeの戻り値  = " + name);
                System.out.println("remove後のqueue = " + queue);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public static void LinkedListTest4() {

        LinkedList<String> stack = new LinkedList<String>();

        stack.addFirst("azrs");
        System.out.println("addFirst後のstack = " + stack);
        stack.addFirst("kabotya");
        System.out.println("addFirst後のstack = " + stack);
        stack.addFirst("cloneko");
        System.out.println("addFirst後のstack = " + stack);
        stack.addFirst("ito");
        System.out.println("addFirst後のstack = " + stack);
        stack.addFirst("usathon");
        System.out.println("addFirst後のstack = " + stack);

        try {

            while (true) {
                String name = stack.getFirst();
                System.out.println("getFirstの戻り値 = " + name);

                name = stack.removeFirst();
                System.out.println("removeFirstの戻り値  = " + name);
                System.out.println("removeFirst後のstack = " + stack);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public static void HashSetTest1() {

        Set<String> set = new HashSet<String>();

        set.add("azrs");
        set.add("kabotya");
        set .add("cloneko");
        set.add("ito");
        set.add("usathon");

        for (String name : set) {
            System.out.println(name);
        }

        if (set.contains("azrs")) {
            System.out.println("setにazrsは含まれています");
        } else {
            System.out.println("setにazrsは含まれていません");
        }
    }

    public static void HashMapTest() {

        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("azrs",100);
        map.put("kabotya",57);
        map.put("cloneko",85);
        map.put("ito",85);
        map.put("usathon", 92);

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println();

        //キーに関する拡張forループ
        for (String name : map.keySet()) {
            System.out.println(name);
        }
        System.out.println();

        //値に関する拡張forループ
        for (int value : map.values()) {
            System.out.println(value);
        }
        System.out.println();

        //キーに関する拡張forループで値も得る
        for (String name : map.keySet()) {
            System.out.println(name + " => " + map.get(name));
        }
        System.out.println();

        //キーkabotyaの値を得る
        System.out.println("kabotyaの値 = " + map.get("kabotya"));

        //キーkabosuの値を得る
        System.out.println("kabosuの値 = " + map.get("kabosu"));

    }
}
