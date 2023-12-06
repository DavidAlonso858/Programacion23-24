import java.util.Scanner;

public class Ejercicio53P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];

        for (int i = 0; i < n.length; i++) {
            System.out.print("Introduzca numero: ");
            n[i] = sc.nextInt();
        }

        System.out.println("\nLa media de los numeros positivos es: " + mediaPositivos(n));
        System.out.println("La media de los numeros negativos es: " + mediaNegativos(n));
        System.out.println("El numero de ceros es: " + ceros(n));
    }

    public static int mediaPositivos(int[] n) {
        int suma = 0, media, contPos = 0;

        for (int numero2 : n) {
            if (numero2 >= 0) {
                suma += numero2;
                contPos++;
            }
        }
        if (contPos == 0) {
            return 0;
        }

        media = suma / contPos;
        return media;
    }

    public static int mediaNegativos(int[] n) {
        int suma = 0, media, contNeg = 0;

        for (int numero2 : n) {
            if (numero2 < 0) {
                suma += numero2;
                contNeg++;
            }
        }
        if (contNeg == 0) {
            return 0;
        }

        media = suma / contNeg;
        return media;
    }

    public static int ceros(int[] n) {
        int contCeros = 0;

        for (int numero2 : n) {
            if (numero2 == 0) {
                contCeros++;
            }
        }

        return contCeros;
    }
}
