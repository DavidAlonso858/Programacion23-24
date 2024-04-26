import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        FileReader in = null;
        int c;
        String texto = "";

        try {
            in = new FileReader("PruebaFileReader102.java");
            c = in.read();
            while (c != -1) {
                texto += (char) c;
                c = in.read();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        System.out.println(texto);
    }
}
