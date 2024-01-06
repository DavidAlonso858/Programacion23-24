import java.util.Arrays;
import java.util.Scanner;

public class Refuerzo21 {

    public static int aleatorio() {
        int numero;

        numero = (int) (Math.random() * (500 - 0 + 1));

        return numero;
    }

    public static int[] rellenarArray(int[] tabla) {

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio();
        }
        return tabla;
    }

    public static int[] multiploCinco(int[] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] % 5 != 0 && tabla[i] != 0) {
                while (tabla[i] % 5 != 0) {
                    tabla[i]++; // aumenta hasta el siguiente (para sumar lo pongo fuera de la caja)
                }
            }
        }
        return tabla;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[15];

        System.out.println("Array original: ");
        System.out.print(Arrays.toString(rellenarArray(tabla)));
        System.out.println("\n\nArray cincuerizado: ");
        System.out.print(Arrays.toString(multiploCinco(tabla)));
    }
}
