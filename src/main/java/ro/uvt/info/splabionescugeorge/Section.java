package ro.uvt.info.splabionescugeorge;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Section extends BaseElement {
    private String title;

    @OneToMany(targetEntity = BaseElement.class, cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderColumn
    private List<Element> children = new ArrayList<>();

    public Section() {}

    public Section(String title) { this.title = title; }

    public String getTitle() { return title; }

    public List<Element> getChildren() { return children; }

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
