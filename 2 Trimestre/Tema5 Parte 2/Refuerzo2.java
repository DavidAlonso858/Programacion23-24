import java.util.Scanner;

public class Refuerzo2 {

    public static void rellenarMatriz(int[][] hojaCalculo, Scanner sc) {
        for (int i = 0; i < hojaCalculo.length; i++) {
            for (int j = 0; j < hojaCalculo[i].length; j++) {
                System.out.print("Introduza numero: ");
                hojaCalculo[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static int sumaColumnas(int[][] hojaCalculo, int Columnas) {
        int sumaColumnas = 0;
        for (int i = 0; i < hojaCalculo.length; i++) {
            sumaColumnas += hojaCalculo[i][Columnas];
        }

        return sumaColumnas;
    }

    public static int sumaFilas(int[][] hojaCalculo, int filas) {
        int sumaFilas = 0;
        for (int i = 0; i < hojaCalculo[filas].length; i++) {
            sumaFilas += hojaCalculo[filas][i];
        }

        return sumaFilas;
    }

    public static void mostrar(int[][] hojaCalculo) {
        int sumaTotal = 0;
        for (int i = 0; i < hojaCalculo.length; i++) {
            System.out.print("\t  ");
            for (int j = 0; j < hojaCalculo[i].length; j++) {
                System.out.print(hojaCalculo[i][j] + "\t");
            }
            System.out.print("fila " + sumaFilas(hojaCalculo, i));
            sumaTotal += sumaFilas(hojaCalculo, i);
            System.out.println();
        }
        System.out.print("Columnas: ");
        for (int columnas = 0; columnas < hojaCalculo[0].length; columnas++) {
            System.out.print(sumaColumnas(hojaCalculo, columnas) + "\t");
            sumaTotal += sumaColumnas(hojaCalculo, columnas);
        }
        System.out.print("TOTAL: " + sumaTotal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] hojaCalculo = new int[4][5];

        rellenarMatriz(hojaCalculo, sc);
        mostrar(hojaCalculo);
    }
}
 