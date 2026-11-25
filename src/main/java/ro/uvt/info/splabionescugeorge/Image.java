package ro.uvt.info.splabionescugeorge;

import jakarta.persistence.Entity;

@Entity
public class Image extends BaseElement {
    private String url;

    public Image() {}

    public Image(String url) { this.url = url; }

    public String getUrl() { return url; }

    public void render() { System.out.println("Image with name:" + url); }

    public void accept(Visitor visitor) { visitor.visit(this); }

    public void add(Element e) { throw new UnsupportedOperationException("Image is a leaf"); }
    public void remove(Element e) { throw new UnsupportedOperationException("Image is a leaf"); }
    public Element get(int index) { throw new UnsupportedOperationException("Image is a leaf"); }
}
