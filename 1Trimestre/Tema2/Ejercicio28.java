import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x, x1, raiz;

        System.out.println("Introduzca la a: ");
        a = sc.nextDouble();

        System.out.println("Introduzca la b: ");
        b = sc.nextDouble();

        System.out.println("Introduzca la c: ");
        c = sc.nextDouble();

        raiz = (b * b) - (4.0 * a * c);

        if (raiz < 0) {
            System.out.println("No se puede realizar");
        } else {
            x = -b + Math.sqrt((raiz)) / 2.0 * a;
            x1 = -b - Math.sqrt(raiz) / 2.0 * a;
            System.out.println("El resultado es: "+x+ " y " +x1);

        }
    }
}
