package ro.uvt.info.splabionescugeorge;

public class Image implements Element {
    private String url;

    public Image(String url) { this.url = url; }

    public void render() { System.out.println("Image with name:" + url); }

    public void accept(Visitor visitor) { visitor.visit(this); }

    public void add(Element e) { throw new UnsupportedOperationException("Image is a leaf"); }
    public void remove(Element e) { throw new UnsupportedOperationException("Image is a leaf"); }
    public Element get(int index) { throw new UnsupportedOperationException("Image is a leaf"); }
}
