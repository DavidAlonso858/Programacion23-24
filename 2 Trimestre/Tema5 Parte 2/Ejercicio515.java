import java.util.Scanner;

public class Ejercicio515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] alumnos = new int[5][3];

        rellenarMatriz(alumnos, sc);
        mostrar(alumnos);
    }

    public static void rellenarMatriz(int[][] tabla, Scanner sc) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print("Alumno " + (i + 1) + ". Introduzca la nota del trimestre " + (j + 1) + ": ");
                tabla[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void mostrar(int[][] tabla) {
        int sumaPrimer = 0, sumaSegun = 0, sumaTercer = 0, tamaño = 0;
        for (int i = 0; i < tabla.length; i++) {
            tamaño = tabla.length;
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
                if (j == 0) {
                    sumaPrimer += tabla[i][j];
                } else if (j == 1) {
                    sumaSegun += tabla[i][j];
                } else if (j == 2) {
                    sumaTercer += tabla[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nLa media del primer trimestre es: " + (sumaPrimer / tamaño));
        System.out.println("\nLa media del segundo trimestre es: " + (sumaSegun / tamaño));
        System.out.println("\nLa media del tercer trimestre es: " + (sumaTercer / tamaño));
    }
}
