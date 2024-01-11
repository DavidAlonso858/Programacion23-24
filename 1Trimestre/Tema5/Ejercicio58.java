import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla;
        int[] tablaPares = new int[0];
        int[] tablaImpares = new int[0];
        int n;

        do {
            System.out.println("Introduzca el numero de enteros en la tabla: ");
            n = sc.nextInt();
        } while (n <= 0);

        tabla = new int[n];
        rellenarArray(tablaImpares, sc);
    }

    public static int[] rellenarArray(int[] tabla, Scanner sc) {

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Insertar numero: ");
            tabla[i] = sc.nextInt();
        }
        return tabla;
    }

    public static int[] Par(int[] tabla, int[] tablaPares) {
        int indice = 0;
        for (int i : tabla) {
            if (i % 2 == 0) {
                tablaPares[indice++] = i;
            }
        }
        return tablaPares;
    }

    public static int[] Impar(int[] tabla, int[] tablaImpares) {
        int indice = 0;
        for (int i : tabla) {
            if (i % 2 != 0) {
                tablaImpares[indice++] = i;
            }
        }
        return tablaImpares;
    }

}
