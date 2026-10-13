package ro.uvt.info.splabionescugeorge;

import java.util.ArrayList;

public class Book extends Section {
    private ArrayList<Author> authors = new ArrayList<>();

    public Book(String title) { super(title); }

    public void addAuthor(Author a) { authors.add(a); }
    public void addContent(Element e) { add(e); }

    public void render() {
        System.out.println("Book: " + getTitle());
        System.out.println("Authors:");
        for (int i = 0; i < authors.size(); i++) {
            authors.get(i).print();
        }
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        acceptChildren(visitor);
    }
}
