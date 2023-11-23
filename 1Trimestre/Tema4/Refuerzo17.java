import java.util.Scanner;

import Biblioteca.Biblioteca;

public class Refuerzo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binario;

        System.out.print("Introduzca un numero binario: ");
        binario = sc.nextInt();

        System.out.println(("El decimal de " + binario + " es " + binarioDecimal(binario)));
    }

    public static int binarioDecimal(int binario) {
        int decimal = 0, aux = binario, cifra, longitud = 0;

        while (aux > 0) {
            longitud++;
            aux /= 10;
        }

        for (int contador = 0; contador < longitud; contador++) {
            cifra = binario % 10;
            decimal += cifra * Biblioteca.potencia(2, contador);
            binario /= 10;
        }
        return decimal;
    }
}
