import java.util.Scanner;

public class Ejercicio56Borrar {

    public static void mostrar(int[] tabla) {
        System.out.print("[ ");
        for (int i = 0; i < tabla.length - 1; i++) {
            if (i == tabla.length - 2) {
                System.out.print(tabla[i] + " ");
            } else
                System.out.print(tabla[i] + ", ");
        }
        System.out.print("]");
    }

    public static void ordenar(int[] tabla) {
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

    public static int busquedaOrdenada(int[] tabla, int numero) {
        boolean encontrado = false;
        int posicion = -1, inicio = 0, fin = tabla.length - 1;

        while (inicio <= fin && !encontrado) {
            int medio = (fin + inicio) / 2;

            if (tabla[medio] == numero) {
                posicion = medio;
                encontrado = true;
            }

            else if (tabla[medio] < numero) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }

        }
        return posicion;
    }

    public static int[] rotarBorrado(int[] tabla, int posicion) {
        int temporal = tabla[posicion];
        for (int i = posicion; i < tabla.length - 1; i++) {
            tabla[i] = tabla[i + 1];
        }
        tabla[tabla.length - 1] = temporal;

        return tabla;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = { 6, 4, 3, 8, 10 };
        int borrar = 6;

        ordenar(tabla);

        int posicion = busquedaOrdenada(tabla, borrar);

        rotarBorrado(tabla, posicion);
        System.out.println("Tabla con el " + borrar + " eliminado: ");
        mostrar(tabla);
    }
}
