package ro.uvt.info.splabionescugeorge;

import java.util.ArrayList;

public class Section implements Element {
    private String title;
    private ArrayList<Element> children = new ArrayList<>();

    public Section(String title) { this.title = title; }

    public String getTitle() { return title; }

    public void render() { System.out.println(title); }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        acceptChildren(visitor);
    }

    protected void acceptChildren(Visitor visitor) {
        for (int i = 0; i < children.size(); i++) {
            children.get(i).accept(visitor);
        }
    }

    public void add(Element e) { children.add(e); }
    public void remove(Element e) { children.remove(e); }
    public Element get(int index) { return children.get(index); }
}
