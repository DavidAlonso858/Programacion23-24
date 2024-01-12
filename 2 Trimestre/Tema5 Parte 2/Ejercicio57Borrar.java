import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio57Borrar {

    public static int[] rellenarArray(int[] tabla, Scanner sc) {
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Introduce numero: ");
            tabla[i] = sc.nextInt();
        }
        return tabla;
    }

    public static void mostrar(int[] tabla) {
        System.out.print("[ ");
        for (int i = 0; i < tabla.length; i++) {
            if (i == tabla.length - 1) {
                System.out.print(tabla[i] + " ");
            } else
                System.out.print(tabla[i] + ", ");
        }
        System.out.print("]");
    }

    public static int aleatorio(int[] tabla) {
        int numero;

        numero = (int) (Math.random() * (tabla.length));

        return numero;
    }

    public static void ordenar(int[] tabla) { // burbuja
        int ordeTemp;

        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = 0; j < tabla.length - i - 1; j++) {
                if (tabla[j] > tabla[j + 1]) {
                    ordeTemp = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = ordeTemp;
                }
            }
        }
    }

    public static int[] rotarBorrado(int[] tabla, int numero, int numero2) {
        int media = (tabla[numero] + tabla[numero2]) / tabla.length;

        // primera posicion
        int temporal = tabla[numero];
        for (int i = numero; i < tabla.length - 1; i++) {
            tabla[i] = tabla[i + 1];
        }
        tabla[tabla.length - 1] = temporal;

        // segunda posicion
        int temporal2 = tabla[numero2];
        for (int i = numero2; i < tabla.length - 1; i++) {
            tabla[i] = tabla[i + 1];
        }
        tabla[tabla.length - 2] = temporal2;

        int[] tablaBorrado = new int[tabla.length - 2];
        for (int i = 0; i < tablaBorrado.length; i++) {
            tablaBorrado[i] = tabla[i];
        }
        // añadir media
        tablaBorrado = Arrays.copyOf(tablaBorrado, tablaBorrado.length + 1);
        tablaBorrado[tablaBorrado.length - 1] = media;
        return tablaBorrado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla;
        int n;

        do {
            System.out.print("¿Cuantos numeros favoritos tienes? (al menos 2): ");
            n = sc.nextInt();
        } while (n < 2);

        tabla = new int[n];
        rellenarArray(tabla, sc);
        ordenar(tabla);
        mostrar(tabla);

        while (tabla.length > 1) {

            int numero1 = aleatorio(tabla);
            int numero2 = aleatorio(tabla);

            System.out.println("\n\nPosciones:" + numero1 + " y " + numero2);

            System.out.println();

            tabla = rotarBorrado(tabla, numero1, numero2);
            mostrar(tabla);
        }
    }
}
