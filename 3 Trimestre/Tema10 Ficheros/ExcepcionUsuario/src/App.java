import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        try {
            System.out.print("Introduzca la edad: ");
            edad = sc.nextInt();
            if (edad < 0) {
                throw new ExcepcionEdadNegativa(); // lanzo la excepcion
            } else {
                System.out.println(edad);
            }
        } catch (ExcepcionEdadNegativa ex) {
            System.out.println(ex);
        } finally {
            System.out.println("EDAD");
        }

    }
}
