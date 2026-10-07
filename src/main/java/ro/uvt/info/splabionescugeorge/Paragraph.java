package ro.uvt.info.splabionescugeorge;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) { this.text = text; }

    public String getText() { return text; }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public void print() {
        if (alignStrategy == null) {
            System.out.println("Paragraph: " + text);
        } else {
            alignStrategy.render(this, new Context(30));
        }
    }

    public void add(Element e) { throw new UnsupportedOperationException("Paragraph is a leaf"); }
    public void remove(Element e) { throw new UnsupportedOperationException("Paragraph is a leaf"); }
    public Element get(int index) { throw new UnsupportedOperationException("Paragraph is a leaf"); }
}