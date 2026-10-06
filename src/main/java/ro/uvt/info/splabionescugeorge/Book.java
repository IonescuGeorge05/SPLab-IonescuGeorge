package ro.uvt.info.splabionescugeorge;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Author> authors = new ArrayList<>();
    private ArrayList<Element> content = new ArrayList<>();

    public Book(String title) { this.title = title; }

    public void addAuthor(Author a) { authors.add(a); }
    public void addContent(Element e) { content.add(e); }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (int i = 0; i < authors.size(); i++) {
            authors.get(i).print();
        }
        for (int i = 0; i < content.size(); i++) {
            content.get(i).print();
        }
    }
}