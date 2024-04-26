import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(leerEntero());
    }

    public static int leerEntero() {
        int resultado;

        while (true) {
            try {
                System.out.print("Introduzca entero: ");
                resultado = new Scanner(System.in).nextInt(); // sale si la lectura ha sido correcta
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Tipo erroneo");
            } finally {
                System.out.println("\nInputMismatchException cuando el tipo introducido no coincide con el scanner");
            }
        }
        return resultado;
    }
}
