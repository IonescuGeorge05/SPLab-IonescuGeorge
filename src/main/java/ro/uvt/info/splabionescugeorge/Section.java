package ro.uvt.info.splabionescugeorge;

import java.util.ArrayList;

public class Section implements Element {
    private String title;
    private ArrayList<Element> children = new ArrayList<>();

    public Section(String title) { this.title = title; }

    public void print() {
        System.out.println(title);
        for (int i = 0; i < children.size(); i++) {
            children.get(i).print();
        }
    }

    public void add(Element e) { children.add(e); }
    public void remove(Element e) { children.remove(e); }
    public Element get(int index) { return children.get(index); }
}