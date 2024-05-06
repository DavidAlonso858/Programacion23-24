import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";

        System.out.println("\nIntroduzca su frase caballero: ");
        frase = sc.nextLine();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("frase.dat"))) {
            out.writeObject(frase);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("frase.dat"))) {
            frase = (String) in.readObject();
            System.out.println("\nRecuperamos la frase, mostrandola por pantalla: ");
            System.out.print("\"" + frase + "\"");

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
