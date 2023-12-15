import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave=6;
        int[] t = { 3, 4, 6, 8 };

        System.out.println(Arrays.toString(buscarTodos(t, clave)));
    }

    public static int busquedaDesordenada(int[] tabla, int valor) {
        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < tabla.length && !encontrado; i++) {
            if (tabla[i] == valor) {
                posicion = i;
                encontrado = true;
            }
        }
        return posicion;
    }

    public static int[] buscarTodos(int[] t, int clave) {
        int busqueda;
        int[] tablaNueva = new int[t.length];

        for (int i = 0; i < t.length; i++) {
            busqueda = busquedaDesordenada(t, clave);
            if (busqueda >= 0) {
                tablaNueva[i] = busqueda;
            }
        }
        return tablaNueva;
    }
}
