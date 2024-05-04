import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double grados;
        RegistroTemperatura[] registro = new RegistroTemperatura[0];

        System.out.println("\nMENU DE TEMPERATURA");
        System.out.println("-----------------------------------------");
        do {
            System.out.println("\n1. Añadir registro de temperatura");
            System.out.println("2. Mostrar listado con los registros");
            System.out.println("3. Salir");
            System.out.print("Introduce la opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la temperatura en grados Centigrados: ");
                    grados = sc.nextDouble();

                    RegistroTemperatura r = new RegistroTemperatura(grados);
                    registro = Arrays.copyOf(registro, registro.length + 1);
                    registro[registro.length - 1] = r;

                    break;
                case 2:
                    System.out.println(Arrays.toString(registro));
                    break;
                case 3:
                    System.out.println("Tenga buen dia!");
                    break;
                default:
                    System.out.println("Fallo al introducir la opcion");
                    break;
            }
        } while (opcion != 3);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Registro.dat"))) {
            out.writeObject(registro);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Registro.dat"))) {
            registro = (RegistroTemperatura[]) in.readObject();

            for (RegistroTemperatura r : registro) {
                System.out.println(r);
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
