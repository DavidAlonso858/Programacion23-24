import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea = "", original;
        System.out.print("Introduce el nombre del fichero: ");
        original = sc.nextLine();
        original += ".txt";
        String copia = "copia_de_" + original;

        try (BufferedReader in = new BufferedReader(new FileReader(original))) {
            BufferedWriter out = new BufferedWriter(new FileWriter(copia));
            linea = in.readLine();
            while (linea != null) {
                out.write(linea);
                out.newLine();
                linea = in.readLine();
            }
            System.out.println("El archivo copiado: " + copia);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}