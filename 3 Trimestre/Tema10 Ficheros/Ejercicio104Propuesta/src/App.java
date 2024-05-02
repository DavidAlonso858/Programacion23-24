import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "buenas tardes";

        try (BufferedWriter out = new BufferedWriter(new FileWriter("texto104.txt"))) {
            while (!cadena.equals("fin")) {
                out.write(cadena);
                cadena = "espero que todo salga bien";
                out.newLine();
                out.write(cadena);
                cadena = "fin";
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
