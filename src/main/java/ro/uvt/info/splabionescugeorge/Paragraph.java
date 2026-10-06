package ro.uvt.info.splabionescugeorge;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) { this.text = text; }

    public void print() { System.out.println("Paragraph: " + text); }

    public void add(Element e) { throw new UnsupportedOperationException("Paragraph is a leaf"); }
    public void remove(Element e) { throw new UnsupportedOperationException("Paragraph is a leaf"); }
    public Element get(int index) { throw new UnsupportedOperationException("Paragraph is a leaf"); }
}