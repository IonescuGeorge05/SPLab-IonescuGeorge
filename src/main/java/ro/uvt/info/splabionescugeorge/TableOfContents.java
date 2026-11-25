package ro.uvt.info.splabionescugeorge;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.OrderColumn;

import java.util.ArrayList;
import java.util.List;

@Entity
public class TableOfContents extends BaseElement {
    @ElementCollection
    @OrderColumn
    private List<String> entries = new ArrayList<>();

    public List<String> getEntries() { return entries; }

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
