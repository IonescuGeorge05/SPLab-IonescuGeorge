package ro.uvt.info.splabionescugeorge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpLabIonescuGeorgeApplication {

    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));

        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();

        Book myBook = new Book("Noapte buna, copii!");
        myBook.addAuthor(new Author("Radu Pavel Gheo"));
        myBook.addContent(cap1);
        Section cap2 = new Section("Capitolul 2");
        cap2.add(new Paragraph("Paragraph 5"));
        myBook.addContent(cap2);

        System.out.println();
        GenerateToC tocVisitor = new GenerateToC();
        myBook.accept(tocVisitor);
        tocVisitor.getToC().render();

        System.out.println();
        myBook.accept(new RenderContentVisitor());
    }
}
