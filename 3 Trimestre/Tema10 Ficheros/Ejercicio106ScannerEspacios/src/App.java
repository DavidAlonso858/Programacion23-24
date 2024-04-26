import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader in = null;
        String linea = "";
        int num;
        double suma = 0, contador = 0;

        try {
            in = new BufferedReader(new FileReader("Enteros.txt"));
            linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);
                while (sc.hasNext()) { // verifica si hay un token en la linea
                    if (sc.hasNextInt()) { // verifica si ese token es un int
                        num = sc.nextInt();
                        System.out.println(num + " ");
                        suma += num;
                        contador++;
                    }
                }
                linea = in.readLine();
            }
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + (suma / contador));
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
