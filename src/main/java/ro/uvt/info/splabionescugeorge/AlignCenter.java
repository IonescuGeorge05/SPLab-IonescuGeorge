package ro.uvt.info.splabionescugeorge;

public class AlignCenter implements AlignStrategy {
    public void render(Paragraph paragraph, Context context) {
        String text = paragraph.getText();
        int spaces = (context.getWidth() - text.length()) / 2;
        String line = "";
        for (int i = 0; i < spaces; i++) {
            line = line + " ";
        }
        System.out.println(line + text);
    }
}