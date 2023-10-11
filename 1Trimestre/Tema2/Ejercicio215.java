import java.util.Scanner;

public class Ejercicio215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real1, real2, area;

        System.out.println("Introduzca la base del triangulo: ");
        real1 = sc.nextDouble();

        System.out.println("Introduzca la altura del triangulo: ");
        real2 = sc.nextDouble();

        if (real1 > 0 && real2 > 0) {
            area = (real1 * real2) / 2;
            System.out.printf("El area del triangulo es: %.4f", area);
        } else {
            System.out.println("\nNo tiene sentido que la altura o base sea negativa");
        }
    }
}
