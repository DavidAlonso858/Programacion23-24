import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio513 {

    public static int aleatorio(int[] tabla) {
        int numero;

        numero = (int) (Math.random() * (tabla.length - 1));

        return numero;
    }

    public static int[] desordenarCopia(int[] tabla) {
        int temporal, camnbioPosicion;
        int[] tablaCopia = new int[tabla.length];

        for (int i = 0; i < tablaCopia.length; i++) {
            tablaCopia[i] = tabla[i];
        }

        for (int i = 0; i < tablaCopia.length; i++) { // trabajo con la copia
            temporal = tablaCopia[i];
            camnbioPosicion = aleatorio(tablaCopia);
            tablaCopia[i] = tablaCopia[camnbioPosicion];
            tablaCopia[camnbioPosicion] = temporal;
        }
        return tablaCopia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = { 2, 4, 6, 8, 10 };

        System.out.println("La copia desordenada: " + Arrays.toString(desordenarCopia(tabla)));
        System.out.println("La tabla original: " + Arrays.toString(tabla));
    }
}
