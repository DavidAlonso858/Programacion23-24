import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("\nNumeros de valores para la tabla: ");
        n = sc.nextInt();

        Double[] tablaD = new Double[n];

        for (int i = 0; i < tablaD.length; i++) {
            System.out.print("Introduzca un valor double: ");
            tablaD[i] = sc.nextDouble();
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tablaDouble.dat"))) {
            out.writeObject(tablaD);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("tablaDouble.dat"))) {
            tablaD = (Double[]) in.readObject();

            System.out.println("\nValores de la tabla");
            for (Double d : tablaD) {
                System.out.println(d);
            }

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
