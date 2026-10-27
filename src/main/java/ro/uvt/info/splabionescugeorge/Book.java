package ro.uvt.info.splabionescugeorge;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class Book extends Section {
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Author> authors = new ArrayList<>();

    public Book() {}

    public Book(String title) { super(title); }

    public List<Author> getAuthors() { return authors; }

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
