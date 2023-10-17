import java.util.Scanner;

public class Repaso9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, x2, d, a, b, c;

        System.out.println("Introduzca el valor de a: ");
        a = sc.nextDouble();

        System.out.println("Ahora introduzca el valor de b: ");
        b = sc.nextDouble();

        System.out.println("Ahora introduzca el valor de c: ");
        c = sc.nextDouble();

        d = (b * b) - 4 * a * c;
        if (d < 0 || a == 0) {
            System.out.println("\nEsta ecuacion no tiene solucion real");
        } else {
            x = (-b + Math.sqrt(d)) / (2.0 * a);
            x2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("\nLas soluciones de x son: " + x + " y " + x2);
        }
    }
}
