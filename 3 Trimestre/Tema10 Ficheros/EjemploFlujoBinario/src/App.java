import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] t = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
            for (int i : t) {
                out.writeInt(i); // escribo los valores del array en un fichero
            }

            // out.writeObject(t); directament escribe el array
            System.out.println(Arrays.toString(t));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
            for (int i = 0; i < t.length; i++) {
                System.out.println(in.readInt()); // leemos los datos asignados
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
