import java.util.Scanner;

public class Ejercicio617DividirPalabra {

    public static void divisionPalabra(int n, String palabra) {
        int longitud = palabra.length();

        for (int i = 0; i < longitud; i += n) {
            int fin = Math.min(i + n, longitud);
            System.out.println(palabra.substring(i, fin));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        int n = 3;

        System.out.print("Introduzca la palabra a dividir: ");
        palabra = sc.nextLine();

        divisionPalabra(n, palabra);
    }
}
