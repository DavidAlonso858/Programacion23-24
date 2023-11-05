import java.util.Scanner;

public class Ejercicio318MinMaxComunDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, mayor, maxComunDivisor = 0, minComunMultiplo = 0;

        do {
            System.out.print("Introduce el numero a: ");
            a = sc.nextInt();
            System.out.print("Introduce el numero b: ");
            b = sc.nextInt();
        } while (a < 0 || b < 0);

        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }
        for (int i = mayor; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                if (maxComunDivisor < i) { //almacenar
                    maxComunDivisor = i;
                }
            }
        }
        minComunMultiplo = a * b / maxComunDivisor;

        System.out.println("\nEl maximo comun divisor es: " + maxComunDivisor);
        System.out.println("\nEl minimo comun multiplo es: " + minComunMultiplo);

    }

}
