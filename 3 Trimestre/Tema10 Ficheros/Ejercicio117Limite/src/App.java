import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        // OOS = ObjectOutputStream
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("numeros.dat"))) {
            System.out.print("\nIntroduzca un num: ");
            num = sc.nextInt();
            while (num != -1) {
                if (num > -1) {
                    out.writeInt(num);
                }
                System.out.print("Introduzca un num: ");
                num = sc.nextInt();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("copiaNumeros.dat"))) {

            while (in.available() > 0) { // mientras quede algo que lo lea available() > 0
                num = in.readInt();
                System.out.println("Numero: " + num);
                out.writeInt(num);
            }

        } catch (EOFException ex) { // para cuando se de el limite
            System.out.println("FIN DE FICHERO");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
