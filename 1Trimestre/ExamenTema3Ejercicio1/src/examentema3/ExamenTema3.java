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

        for (int altura = 3; altura <= numeroFilas; altura++) {
            for (int blanco = 0; blanco < numeroFilas - altura; blanco++) {
                System.out.print(" ");
            }

            for (int pintarNumeros = altura; pintarNumeros >= 3; pintarNumeros--) {
                System.out.print(pintarNumeros);
            }
            for (int pintarNumeros = altura; pintarNumeros >= 4; pintarNumeros--) {
                System.out.print(pintarNumeros);
            }

            System.out.println();
        }
    }
}
