package ro.uvt.info.splabionescugeorge;

public class ImageProxy implements Element {
    private String url;
    private Image realImg;

    public ImageProxy(String url) { this.url = url; }

    private Image loadImage() {
        if (realImg == null) {
            realImg = new Image(url);
        }
        return realImg;
    }

    public void render() { loadImage().render(); }

    public void accept(Visitor visitor) { visitor.visit(this); }

    public void add(Element e) { throw new UnsupportedOperationException("ImageProxy is a leaf"); }
    public void remove(Element e) { throw new UnsupportedOperationException("ImageProxy is a leaf"); }
    public Element get(int index) { throw new UnsupportedOperationException("ImageProxy is a leaf"); }
}
