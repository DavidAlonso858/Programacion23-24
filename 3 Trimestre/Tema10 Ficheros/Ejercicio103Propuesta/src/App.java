import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader in = null;
        String linea = "", nombre;
        int contador = 0;
        double sumaEdades, sumaEstaturas;

        try {
            in = new BufferedReader(new FileReader("Jugadores.txt"));
            linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);
                if (sc.hasNext()) {
                    nombre = sc.next();
                    System.out.println(nombre);
                    contador++;
                }
            }

        } catch (IOException ex) {

        }
    }
}
