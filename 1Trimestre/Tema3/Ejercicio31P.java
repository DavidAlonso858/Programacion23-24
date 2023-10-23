import java.util.Scanner;

public class Ejercicio31P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad1, edadMax = -1, edadMin = 200;

        System.out.print("Introduce la edad: ");
        edad1 = sc.nextInt();

        while (edad1 > -1) {
            if (edad1 > edadMax) {
                edadMax = edad1;
            }
            if (edad1 < edadMin) {
                edadMin = edad1;
            }
            System.out.print("Introduce la edad: ");
            edad1 = sc.nextInt();
        }
        System.out.println("La edad maxima es: " + edadMax);
        System.out.println("La edad minima es: " + edadMin);
    }
}