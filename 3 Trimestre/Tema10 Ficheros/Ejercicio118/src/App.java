import java.io.EOFException;
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
        int num;
        String nombre, dni;

        System.out.print("\nIntroduzca el tamaño de la tabla: ");
        num = sc.nextInt();

        Socio[] tablaSocios = new Socio[num];
        for (int i = 0; i < tablaSocios.length; i++) {
            System.out.print("\nIntroduzca el nombre del socio: ");
            nombre = sc.next();

            sc.nextLine(); // consume la linea vacia

            System.out.print("Introduzca el dni: ");
            dni = sc.next();

            while (dni.length() != 9) { // longitud del DNI obligatorio 9
                System.out.println("El DNI debe tener exactamente 9 caracteres. Inténtelo de nuevo.");
                sc.nextLine(); // consume la linea vacia
                System.out.print("Introduzca el dni (debe tener 9 caracteres): ");
                dni = sc.nextLine();
            }
            tablaSocios[i] = new Socio(dni, nombre);
        }
        System.out.println(Arrays.toString(tablaSocios));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {
            out.writeObject(tablaSocios);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {
            tablaSocios = (Socio[]) in.readObject(); // casteamos el objeto

        } catch (EOFException ex) {
            System.out.println("FIN DEL FICHERO");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(Arrays.toString(tablaSocios));

    }
}