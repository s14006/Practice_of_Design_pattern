package jp.ac.it_college.std.s14006.builder;

/**
 * Created by kabotya on 15/06/10.
 */
public abstract class TextBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    public void makeTitle(String title) {
        buffer.append("=======================\n");
        buffer.append("『" + title + "』\n");
        buffer.append("\n");
    }

    public void makeString(String str) {
        buffer.append("■" + str + "\n");
        buffer.append("\n");
    }

    public void makeItem(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("  ・" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    public void close() {
        buffer.append("======================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
