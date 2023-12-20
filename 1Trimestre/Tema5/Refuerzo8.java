import java.util.Arrays;
import java.util.Scanner;

public class Refuerzo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[12];

        for (int i = 0; i < tabla.length; i++) {
            System.out.print((i + 1) + ". Introduzca la temperatura media del mes: ");
            tabla[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(tabla));
        System.out.println();
        diagrama(tabla);
    }

    public static void diagrama(int[] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Mes " + (i + 1) + ": ");
            for (int j = 0; j < tabla[i]; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
    }
}
