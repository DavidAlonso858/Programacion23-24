import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio55 {

    public static int[] rellenarArray(int[] tablaInser, Scanner sc) {
        for (int i = 0; i < tablaInser.length; i++) {
            System.out.print("Insertar numero: ");
            tablaInser[i] = sc.nextInt();
        }
        return tablaInser;
    }

    public static void ordenar(int[] tabla) { // burbuja
        int temporal;
        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = 0; j < tabla.length - i - 1; j++) {
                if (tabla[j] > tabla[j + 1]) { 
                    temporal = tabla[j + 1];
                    tabla[j + 1] = tabla[j];
                    tabla[j] = temporal;
                }
            }
        }
    }

    public static void mostrar(int[] tabla) {
        System.out.print("\n[ ");
        for (int i = 0; i < tabla.length; i++) {
            if (i == tabla.length - 1) {
                System.out.print(tabla[i] + " ");
            } else
                System.out.print(tabla[i] + ", ");
        }
        System.out.print("]");
    }

    public static int[] insertarNumeroTabla(int[] tabla, int numero) {

        int indiceInsercion = Arrays.binarySearch(tabla, numero);
        if (indiceInsercion < 0) {
            indiceInsercion = -indiceInsercion - 1; // calcula donde deberia estar
        }

        int copia[] = new int[tabla.length + 1]; // nueva tabla para insertarlo
        System.arraycopy(tabla, 0, copia, 0, indiceInsercion); // copia desde el inicio del array hasta la posicion de
                                                               // insercion

        System.arraycopy(tabla, indiceInsercion,
                copia, indiceInsercion + 1, tabla.length - indiceInsercion); // Copia los elementos desde la posición de
                                                                             // inserción en el array original hasta el
                                                                             // final en el nuevo array copia. La
                                                                             // posición de inserción en copia se ajusta
                                                                             // en 1 (indiceInsercion + 1) porque ya se
                                                                             // ha insertado un nuevo elemento en la
                                                                             // posición indiceInsercion.
        copia[indiceInsercion] = numero; // el nuevo elemento
        tabla = copia; // asigna el nuevo array copia

        return tabla;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablaInser = new int[20];
        int insertado = 8;

        rellenarArray(tablaInser, sc);
        ordenar(tablaInser);
        System.out.print("\nArray original: ");
        mostrar(tablaInser);

        System.out.print("\nArray con insercion: ");
        mostrar(insertarNumeroTabla(tablaInser, insertado));
    }
}
