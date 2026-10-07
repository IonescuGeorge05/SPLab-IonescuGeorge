package ro.uvt.info.splabionescugeorge;

public class AlignLeft implements AlignStrategy {
    public void render(Paragraph paragraph, Context context) {
        System.out.println(paragraph.getText());
    }
}