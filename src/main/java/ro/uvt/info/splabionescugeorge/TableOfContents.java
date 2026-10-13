package ro.uvt.info.splabionescugeorge;

import java.util.ArrayList;

public class TableOfContents implements Element {
    private ArrayList<String> entries = new ArrayList<>();

    public void addEntry(String entry) { entries.add(entry); }

    public void render() {
        System.out.println("Table of contents");
        for (int i = 0; i < entries.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + entries.get(i));
        }
    }

    public void accept(Visitor visitor) { visitor.visit(this); }

    public void add(Element e) { throw new UnsupportedOperationException("TableOfContents is a leaf"); }
    public void remove(Element e) { throw new UnsupportedOperationException("TableOfContents is a leaf"); }
    public Element get(int index) { throw new UnsupportedOperationException("TableOfContents is a leaf"); }
}
