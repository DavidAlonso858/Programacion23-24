import java.util.Arrays;
import java.util.Scanner;

public class Refuerzo12 {

    public static void tablaCambio(int[] tabla, int inicial, int ultima) {
        int temporal = tabla[inicial];
        int temporalUltima = tabla[tabla.length - 1];

        for (int i = tabla.length - 1; i > 0; i--) {
            if (i == ultima) {
                tabla[i] = temporal;
            } else if (i <= inicial || i > ultima) {
                tabla[i] = tabla[i - 1];
            }
        }
        tabla[0] = temporalUltima;
        System.out.println("Array final: " + Arrays.toString(tabla));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];
        int inicial, ultima;

        for (int i = 0; i < tabla.length; i++) {
            System.out.print(i + ". Introduzca el numero: ");
            tabla[i] = sc.nextInt();
        }
        System.out.println("Array inicial: " + Arrays.toString(tabla));

        System.out.println("\nIntroduzca dos posiciones de este array. La inicial debe ser menor que la final");

        do {
            System.out.print("Posicion inicial: ");
            inicial = sc.nextInt();
            System.out.print("Posicion final: ");
            ultima = sc.nextInt();
        } while (inicial > ultima || inicial > tabla.length - 1 || inicial < 0 || ultima < 0 || ultima > tabla.length - 1);

        tablaCambio(tabla, inicial, ultima);
    }
}
