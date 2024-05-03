import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] t = { 10, 20, 30, 40, 50, 60, 70 };

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos111.dat"))) {
            out.writeObject(t); // el array es un objeto por lo que se escribe directamente
            System.out.println("\n" + Arrays.toString(t));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
