package jp.ac.it_college.std.s14006.abstract_factory.factory;

import jp.ac.it_college.std.s14006.abstract_factory.factory.Item;

import java.io.*;
import java.util.ArrayList;
/**
 * Created by kabotya on 15/06/11.
 */
public abstract class Page {

    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "を作成しました");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
