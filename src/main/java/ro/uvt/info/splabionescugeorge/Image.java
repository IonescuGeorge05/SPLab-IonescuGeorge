package ro.uvt.info.splabionescugeorge;

public class Image implements Element {
    private String url;

    public Image(String url) { this.url = url; }

    public void print() { System.out.println("Image with name:" + url); }

    public void add(Element e) { throw new UnsupportedOperationException("Image is a leaf"); }
    public void remove(Element e) { throw new UnsupportedOperationException("Image is a leaf"); }
    public Element get(int index) { throw new UnsupportedOperationException("Image is a leaf"); }
}