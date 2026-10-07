package ro.uvt.info.splabionescugeorge;

public class AlignRight implements AlignStrategy {
    public void render(Paragraph paragraph, Context context) {
        String text = paragraph.getText();
        int spaces = context.getWidth() - text.length();
        String line = "";
        for (int i = 0; i < spaces; i++) {
            line = line + " ";
        }
        System.out.println(line + text);
    }
}