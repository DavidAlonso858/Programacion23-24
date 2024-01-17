import java.util.Scanner;

public class Ejercicio512ArraysBidimensionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[5][5]; // {{1, 2, 3, 4 , 5}, {6, 7, 8, 9, 10}};

        rellenarArrayDoble(tabla, sc);
        mostrar(tabla);
    }

    public static void rellenarArrayDoble(int[][] tabla, Scanner sc) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) { // hasta el final de la fila tabla[i].length
                tabla[i][j] = 10 * i + j; // rellenar el hueco de cada fila
            }
        }
    }

    public static void mostrar(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t"); // "\t" para que quede cuadrado
            }
            System.out.println();
        }
    }
}
