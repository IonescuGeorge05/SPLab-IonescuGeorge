package ro.uvt.info.splabionescugeorge;

public class TableOfContents implements Element {

    public void print() { System.out.println("Table of contents"); }

    public void add(Element e) { throw new UnsupportedOperationException("TableOfContents is a leaf"); }
    public void remove(Element e) { throw new UnsupportedOperationException("TableOfContents is a leaf"); }
    public Element get(int index) { throw new UnsupportedOperationException("TableOfContents is a leaf"); }
}