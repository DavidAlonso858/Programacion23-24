import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio57 {

    public static int buscarDesordenada(int[] tabla, int valor) {
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

    public static int[] sinRepetidos(int[] t) {
        int[] sinRepetidos = new int[0];

        for (int recorrido : t) {
            if (buscarDesordenada(sinRepetidos, recorrido) < 0) {
                sinRepetidos = Arrays.copyOf(sinRepetidos, sinRepetidos.length + 1);
                sinRepetidos[sinRepetidos.length - 1] = recorrido;
            }
        }
        return sinRepetidos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = { 8, 4, 6, 2, 8 };

        System.out.println("La tabla nueva es: " + Arrays.toString(sinRepetidos(t)));
    }
}
