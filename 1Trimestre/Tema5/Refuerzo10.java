import java.util.Arrays;
import java.util.Scanner;

public class Refuerzo10 {

    public static int aleatorio() {
        int numero;

        numero = (int) (Math.random() * (100 - 0) + 1);

        return numero;
    }

    public static void rellenarTabla(int[] tabla) {

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio();
        }
        int[] tablaPares = new int[tabla.length];
        int contadorPar = 0, contadorImpar = tabla.length - 1;

        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] % 2 == 0) {
                tablaPares[contadorPar] = tabla[i];
                contadorPar++;
            } else {
                tablaPares[contadorImpar] = tabla[i];
                contadorImpar--;
            }
        }
        System.out.println("La tabla original: " + Arrays.toString(tabla));
        System.out.println("La tabla ordenada de pares e impares: " + Arrays.toString(tablaPares));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[20];

        rellenarTabla(tabla);
    }
}
