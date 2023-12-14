import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio55OrdenarString {

    public static int aleatorio(int fin) {
        int parAleatorio;

        do {
            parAleatorio = (int) (Math.random() * (fin - 2) + 2);
        } while (parAleatorio % 2 != 0);

        return parAleatorio;
    }

    public static int[] rellenaPares(int longitud, int fin) {
        int[] tablaPares = new int[longitud];
        for (int i = 0; i < tablaPares.length; i++) {
            tablaPares[i] = aleatorio(fin);
        }

        for (int i = 0; i < tablaPares.length - 1; i++) {
            for (int j = 0; j < tablaPares.length - 1 - i; j++) {
                if (tablaPares[j] > tablaPares[j + 1]) {
                    int temporal = tablaPares[j];
                    tablaPares[j] = tablaPares[j + 1];
                    tablaPares[j + 1] = temporal;
                }
            }
        }

        System.out.print("\nLa tabla ordenada de pares es: ");
        return tablaPares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud, fin = 100;

        do {
            System.out.print("Introduzca la longitud de pares: ");
            longitud = sc.nextInt();
        } while (longitud <= 0);

        System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
    }

}
