import java.util.Scanner;

public class Ejercicio518 {

    public static void rellenartabla(int[][] tabla, Scanner sc) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print("Introduce numero: ");
                tabla[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static boolean esMagica(int[][] tabla) {
        boolean magica = false;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {

            }
        }
        for (int i = 0; i < tabla.length && !magica; i++) {
            if (calcularSumaFila(tabla, i) == calcularSumaColumna(tabla, 3) // Verificar si la suma de las filas y
                                                                              // columnas coincide
                    || calcularSumaFila(tabla, i) == calcularSumaColumna(tabla, 2)
                    || calcularSumaFila(tabla, i) == calcularSumaColumna(tabla, 1)
                    || calcularSumaFila(tabla, i) == calcularSumaColumna(tabla, 0)) {
                magica = true;
            }
        }
        return magica;
    }

    public static int calcularSumaFila(int[][] tabla, int fila) {
        int suma = 0;
        for (int j = 0; j < tabla[fila].length; j++) {
            suma += tabla[fila][j];
        }
        return suma;
    }

    public static int calcularSumaColumna(int[][] tabla, int columna) {
        int suma = 0;
        for (int i = 0; i < tabla.length; i++) {
            suma += tabla[i][columna];
        }
        return suma;
    }

    public static void mostrar(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[4][4];

        rellenartabla(tabla, sc);
        mostrar(tabla);

        System.out.println(esMagica(tabla) ? "\nEs magica" : "\nNo es magica");

    }
}
