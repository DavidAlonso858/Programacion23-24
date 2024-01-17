import java.util.Scanner;

public class Ejercicio515 {

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
            }
            sumaPrimer += tabla[i][0];
            sumaSegun += tabla[i][1];
            sumaTercer += tabla[i][2];
            System.out.println();
        }
        System.out.println("\nLa media del primer trimestre es: " + (sumaPrimer / tamaño));
        System.out.println("\nLa media del segundo trimestre es: " + (sumaSegun / tamaño));
        System.out.println("\nLa media del tercer trimestre es: " + (sumaTercer / tamaño));
    }

    public static void mediaAlumno(int[][] tabla, int numero) {
        int suma = 0, tamaño = 0;

        switch (numero) {
            case 1:
                for (int j = 0; j < tabla[numero - 1].length; j++) {
                    tamaño = tabla[j].length;
                    suma += tabla[numero - 1][j];
                }

                break;
            case 2:
                for (int j = 0; j < tabla[numero - 1].length; j++) {
                    tamaño = tabla[j].length;
                    suma += tabla[numero - 1][j];
                }
                break;
            case 3:
                for (int j = 0; j < tabla[numero - 1].length; j++) {
                    tamaño = tabla[j].length;
                    suma += tabla[numero - 1][j];
                }
                break;
            case 4:
                for (int j = 0; j < tabla[numero - 1].length; j++) {
                    tamaño = tabla[j].length;
                    suma += tabla[numero - 1][j];
                }
                break;
            case 5:
                for (int j = 0; j < tabla[numero - 1].length; j++) {
                    tamaño = tabla[j].length;
                    suma += tabla[numero - 1][j];
                }
                break;
        }
        System.out.print("\nLa media del alumno " + numero + " es: " + (suma / tamaño));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] alumnos = new int[5][3];

        rellenarMatriz(alumnos, sc);
        mostrar(alumnos);

        int numero;
        do {
            System.out.print("\nDe que alumno quieres saber la media(1-5): ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 5);

        mediaAlumno(alumnos, numero);
    }
}
