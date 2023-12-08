import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud, fin = 100;

        do {
            System.out.print("Introduzca la longitud de pares: ");
            longitud = sc.nextInt();
        } while (longitud <= 0);

        for (int pares : rellenaPares(longitud, fin)) {
            System.out.print(pares + " ");
        }
    }

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
        Arrays.sort(tablaPares);
        System.out.print("\nLa tabla ordenada de pares es: ");
        return tablaPares;
    }

}
