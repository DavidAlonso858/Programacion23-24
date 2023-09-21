import java.util.Scanner;

public class EjercicioEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad1;

        System.out.print("Introduce tu edad: ");
        edad1 = sc.nextInt();

        edad1 +=  1;
        System.out.println("El año que viene tendras: " +edad1 + " años");
    }
}
