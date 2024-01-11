import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio58Insercion {

    public static int[] rellenarArray(int[] tabla, Scanner sc) {
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Insertar numero: ");
            tabla[i] = sc.nextInt();
        }
        return tabla;
    }

    public static int[] Par(int[] tabla, int[] tablaPares) {
        for (int i : tabla) {
            if (i % 2 == 0) {
                tablaPares = Arrays.copyOf(tablaPares, tablaPares.length + 1);
                tablaPares[tablaPares.length - 1] = i;
            }
        }
        return tablaPares;
    }

    public static int[] Impar(int[] tabla, int[] tablaImpares) {
        for (int i : tabla) {
            if (i % 2 != 0) {
                tablaImpares = Arrays.copyOf(tablaImpares, tablaImpares.length + 1);
                tablaImpares[tablaImpares.length - 1] = i;
            }
        }
        return tablaImpares;
    }

    public static void ordenar(int[] tabla) { // burbuja
        int temporal;
        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = 0; j < tabla.length - i - 1; j++) {
                if (tabla[j] > tabla[j + 1]) {
                    temporal = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = temporal;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla;
        int[] tablaPares = new int[0];
        int[] tablaImpares = new int[0];
        int n;

        do {
            System.out.print("Introduzca el numero de enteros en la tabla: ");
            n = sc.nextInt();
        } while (n <= 0);

        tabla = new int[n]; // añado ahora el tamaño
        rellenarArray(tabla, sc);
        ordenar(tabla);

        System.out.println(Arrays.toString(Par(tabla, tablaPares)));
        System.out.println(Arrays.toString(Impar(tabla, tablaImpares)));
    }
}
