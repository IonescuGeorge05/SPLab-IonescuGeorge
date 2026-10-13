package ro.uvt.info.splabionescugeorge;

public class Table implements Element {
    private String title;

    public Table(String title) { this.title = title; }

    public void render() { System.out.println("Table with title:" + title); }

    public void accept(Visitor visitor) { visitor.visit(this); }

    public void add(Element e) { throw new UnsupportedOperationException("Table is a leaf"); }
    public void remove(Element e) { throw new UnsupportedOperationException("Table is a leaf"); }
    public Element get(int index) { throw new UnsupportedOperationException("Table is a leaf"); }
}
