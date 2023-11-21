import java.util.Scanner;

public class Ejercicio412 {

    public static double distancia(double x1, double x2, double y1, double y2) {
        double distancia;

        distancia = Math.sqrt((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));

        return distancia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2;

        System.out.print("Introduzca la x1: ");
        x1 = sc.nextDouble();

        System.out.print("Introduzca la x2: ");
        x2 = sc.nextDouble();

        System.out.print("Introduzca la y1: ");
        y1 = sc.nextDouble();

        System.out.print("Introduzca la y2: ");
        y2 = sc.nextDouble();

        System.out.println("La distancia euclidea es: " + distancia(x1, x2, y1, y2));
    }

}
