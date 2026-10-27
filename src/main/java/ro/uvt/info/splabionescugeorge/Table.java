package ro.uvt.info.splabionescugeorge;

import jakarta.persistence.Entity;

@Entity
@jakarta.persistence.Table(name = "TableElement")
public class Table extends BaseElement {
    private String title;

    public Table() {}

    public Table(String title) { this.title = title; }

    public String getTitle() { return title; }

    public void render() { System.out.println("Table with title:" + title); }

    public void accept(Visitor visitor) { visitor.visit(this); }

    public void add(Element e) { throw new UnsupportedOperationException("Table is a leaf"); }
    public void remove(Element e) { throw new UnsupportedOperationException("Table is a leaf"); }
    public Element get(int index) { throw new UnsupportedOperationException("Table is a leaf"); }
}
