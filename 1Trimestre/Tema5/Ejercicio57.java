import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio57 {

    public static int[] sinRepetidos(int[] t) {
        int[] sinRepetidos = new int[0];

        for (int recorrido : t) {
            if (Arrays.binarySearch(sinRepetidos, recorrido) < 0) {
                sinRepetidos = Arrays.copyOf(sinRepetidos, sinRepetidos.length + 1);
                sinRepetidos[sinRepetidos.length - 1] = recorrido;
            }
        }
        return sinRepetidos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = { 8, 4, 6, 2 };

        System.out.println("La tabla nueva es: " + Arrays.toString(sinRepetidos(t)));
    }
}
