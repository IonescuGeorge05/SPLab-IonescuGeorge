package ro.uvt.info.splabionescugeorge;

public class GenerateToC implements Visitor {
    private TableOfContents toc = new TableOfContents();

    public void visit(Book book) {}
    public void visit(Section section) { toc.addEntry(section.getTitle()); }
    public void visit(TableOfContents toc) {}
    public void visit(Paragraph paragraph) {}
    public void visit(ImageProxy imageProxy) {}
    public void visit(Image image) {}
    public void visit(Table table) {}

    public TableOfContents getToC() { return toc; }
}
