import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio514InsercionValores {

    public static int[] insertar(int[] tabla, int sueldo) { // trabajo con la copia que es la que tiene los valores introducidos
        int[] nuevo = Arrays.copyOf(tabla, tabla.length + 1);
        nuevo[nuevo.length - 1] = sueldo;
        return nuevo;
    }

    public static void ordenar(int[] tabla) {
        int temporal, minimo = 0, maximo = 0;
        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = 0; j < tabla.length - i - 1; j++) {
                if (tabla[j] < tabla[j + 1]) {
                    temporal = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = temporal;
                }
            }
        }
        minimo = tabla[tabla.length - 1];
        maximo = tabla[0];

        System.out.println("El sueldo minimo es: " + minimo);
        System.out.println("El sueldo maximo es: " + maximo);
    }

    public static int media(int[] tabla) {
        int suma = 0, media;
        for (int recorrido : tabla) {
            suma += recorrido;
        }
        media = suma / tabla.length;
        return media;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo;
        int[] tabla = new int[0];
        System.out.println("Encuesta sobre la economia del pueblo. Si no quiere participar introduzca -1\n");

        do {
            System.out.print("Introduce su sueldo: ");
            sueldo = sc.nextInt();
            if (sueldo > -1) {
                tabla = insertar(tabla, sueldo);
            }
        } while (sueldo != -1);

        System.out.println();
        ordenar(tabla);
        System.out.println("La media de los sueldos: " + media(tabla));
        System.out.println("\nOrdenados de forma decreciente son: " + Arrays.toString(tabla));
    }
}
