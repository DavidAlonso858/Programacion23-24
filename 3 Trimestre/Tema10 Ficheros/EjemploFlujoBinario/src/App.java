import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) {
        int[] t = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
            for (int i : t) {
                out.writeInt(i); // escribo los valores del array en un fichero
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
