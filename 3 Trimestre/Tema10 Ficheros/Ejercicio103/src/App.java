import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        BufferedReader in = null;
        String texto = "", linea;

        try {
            in = new BufferedReader(new FileReader("PruebaFileReader102.java")); // usamos el Buffer
            linea = in.readLine();
            while (in != null) {
                texto += linea + "\n";
                linea = in.readLine();
            }
        } catch (IOException ex) {
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
        System.out.println(texto);
    }
}
