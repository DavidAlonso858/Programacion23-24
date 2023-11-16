package examentema3;

import java.util.Scanner;

public class ExamenTema3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroFilas;

        do {
            System.out.print("Introduzca un numero de filas entre 1 y 10: ");
            numeroFilas = sc.nextInt();
        } while (numeroFilas > 10 || numeroFilas < 1);

        for (int altura = 1; altura <= numeroFilas; altura++) { // correcion
            for (int blanco = 0; blanco < numeroFilas - altura; blanco++) {
                System.out.print(" ");
            }

            for (int pintarNumeros = altura; pintarNumeros >= 1; pintarNumeros--) { // correcion
                System.out.print((pintarNumeros + 2) % 10); // correcion: modulo 10 para que no se pasa de ese numero
            }
            for (int pintarNumeros = 2; pintarNumeros <= altura; pintarNumeros++) {
                System.out.print((pintarNumeros + 2) % 10); // correcion: modulo 10 para que no se pasa de ese numero
            }

            System.out.println();
        }
    }
}
