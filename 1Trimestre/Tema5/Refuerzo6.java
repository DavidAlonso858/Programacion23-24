import java.util.Arrays;
import java.util.Scanner;

public class Refuerzo6 {

    public static void mostrarRotacion(int[] tabla) {
        int temporal = tabla[tabla.length - 1];
        for (int i = tabla.length - 1; i >= 0; i--) {
            if (i == 0) {
                tabla[i] = temporal;
            } else {
                tabla[i] = tabla[i - 1];
            }
        }

        System.out.println("La tabla rotada es: " + Arrays.toString(tabla));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[15];

        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Insertar numero: ");
            tabla[i] = sc.nextInt();
        }
        System.out.println("\nLa tabla original: " + Arrays.toString(tabla));

        mostrarRotacion(tabla);
    }
}
