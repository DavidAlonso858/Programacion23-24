import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        FileReader in = null;

        try {
            in = new FileReader("ejemplo.txt");
        } catch (IOException ex) { // IO = input output
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
