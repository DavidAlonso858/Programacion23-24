import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        String linea = "";
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("NumeroRealesConSalto.txt"));
            linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);
                if (sc.hasNextDouble()) {
                    suma += sc.nextDouble();
                }
                linea = in.readLine();
            }
            System.out.println("Suma: " + suma);
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
    }
}
