import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea = "", nombre;
        int contador = 0;
        double sumaEdades = 0, sumaEstaturas = 0;

        try (BufferedReader in = new BufferedReader(new FileReader("Jugadores.txt"))) {
            linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);
                if (sc.hasNext()) {
                    nombre = sc.next();
                    System.out.println(nombre);
                    contador++;
                }
                if (sc.hasNextInt()) {
                    sumaEdades += sc.nextInt();
                }
                if (sc.hasNextDouble()) {
                    sumaEstaturas += sc.nextDouble();
                }
                linea = in.readLine();
            }
            System.out.println("La media de edades es: " + (sumaEdades / contador));
            System.out.println("La media de edades es: " + (sumaEstaturas / contador));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
