import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double[] tablaDouble;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos113.dat"))) {
            System.out.print("\nIntroduzca el numero de elementos: ");
            n = sc.nextInt();

            tablaDouble = new double[n];

            for (int i = 0; i < tablaDouble.length; i++) {
                System.out.print("Introduzca el double: ");
                tablaDouble[i] = sc.nextDouble();
            }
            for (double d : tablaDouble) {
                out.writeDouble(d);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}