package ro.uvt.info.splabionescugeorge;

public class BookStatistics implements Visitor {
    private int imagesCount = 0;
    private int tablesCount = 0;
    private int paragraphsCount = 0;

    public void visit(Book book) {}
    public void visit(Section section) {}
    public void visit(TableOfContents toc) {}
    public void visit(Paragraph paragraph) { paragraphsCount++; }
    public void visit(ImageProxy imageProxy) { imagesCount++; }
    public void visit(Image image) { imagesCount++; }
    public void visit(Table table) { tablesCount++; }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + imagesCount);
        System.out.println("*** Number of tables: " + tablesCount);
        System.out.println("*** Number of paragraphs: " + paragraphsCount);
    }
}
