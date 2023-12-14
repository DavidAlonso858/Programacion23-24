import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio56 {
    public static int busquedaOrdenada(int[] tabla, int recorrido) {
        boolean encontrado = false;
        int medio, posicion = -1, fin = tabla.length - 1, inicio = 0;

        while (inicio <= fin && !encontrado) {
            medio = inicio + (fin - inicio) / 2;
            if (tabla[medio] == recorrido) {
                posicion = medio;
                encontrado = true;
            } else if (tabla[medio] < recorrido) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return posicion;
    }

    public static int buscarAciertos(int[] tablaPrimitiva, int[] tablaGanadora) {
        int aciertos = 0, busqueda;

        for (int recorrido : tablaPrimitiva) {
            busqueda = busquedaOrdenada(tablaGanadora, recorrido);
            if (busqueda >= 0) {
                aciertos++;
            }
        }
        return aciertos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablaPrimitiva = { 6, 12, 18, 8, 17, 9 };
        int[] tablaGanadora = { 6, 7, 8, 9, 10, 11 };

        System.out.println("Se han acertado: " + buscarAciertos(tablaPrimitiva, tablaGanadora));
    }
}
