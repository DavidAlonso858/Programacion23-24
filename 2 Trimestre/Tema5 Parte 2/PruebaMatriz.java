import java.util.Scanner;

public class PruebaMatriz {

    public static void rellenarArrayDoble(int[][] tabla, Scanner sc) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) { // hasta el final de la fila tabla[i].length
                System.out.print("Introduce el numero: ");
                tabla[i][j] = sc.nextInt(); // rellenar el hueco de cada fila
            }
            System.out.println();
        }
    }

    public static void mostrar(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t"); // "\t" para que quede cuadrado
            }
            System.out.println(); // saltar entre filas
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[4][]; // {{1, 2, 3, 4 , 5}, {6, 7, 8, 9, 10}};
        int num;

        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Introduzca el tamaño del fila " + (i + 1) + ": ");
            num = sc.nextInt();
            tabla[i] = new int[num]; // para insetarle tamaño diferente de columna a cada fila
        }

        rellenarArrayDoble(tabla, sc);
        mostrar(tabla);
    }
}
