import java.util.Scanner;

public class Refuerzo5y6MaximoMinimo {

    public static boolean esRepetido(int[][] Matriz, int numero) {
        boolean repetido = false;

        for (int i = 0; i < Matriz.length && !repetido; i++) {
            for (int j = 0; j < Matriz[i].length && !repetido; j++) {
                if (Matriz[i][j] == numero) {
                    repetido = true;
                }
            }
        }
        return repetido;
    }

    public static int aleatorio(int[][] Matriz) {
        int numero;

        do {
            numero = (int) (Math.random() * (1001));
        } while (esRepetido(Matriz, numero));

        return numero;
    }

    public static void rellenarMatriz(int[][] Matriz) {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = aleatorio(Matriz);
            }
        }
    }

    public static void mostrar(int[][] Matriz) {
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, filaMayor = 0, columnaMayor = 0, filaMenor = 0,
                columnaMenor = 0;
        for (int i = 0; i < Matriz.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print(Matriz[i][j] + "\t");
                if (Matriz[i][j] > mayor) { // sacar la posicion del mayor
                    mayor = Matriz[i][j];
                    filaMayor = i + 1;
                    columnaMayor = j + 1;
                }
                if (Matriz[i][j] < menor) { // sacar la posicion del menor
                    menor = Matriz[i][j];
                    filaMenor = i + 1;
                    columnaMenor = j + 1;
                }
            }
            System.out.print("fila " + (i + 1));
            System.out.println();
        }
        System.out.print("Columna: ");
        for (int columnas = 0; columnas < Matriz[0].length; columnas++) {
            System.out.print((columnas + 1) + "\t");
        }
        System.out.println("\n\nLa fila del mayor es " + filaMayor + " y la columna es " + columnaMayor);
        System.out.println("La fila del menor es " + filaMenor + " y la columna es " + columnaMenor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] Matriz = new int[6][10];

        rellenarMatriz(Matriz);
        mostrar(Matriz);
    }
}
