import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio514 {

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
        int sueldo, sueldoIntroducidos = 0;
        System.out.println("Encuesta sobre la economia del pueblo. Si no quiere participar introduzca -1\n");

        do {
            System.out.print("Introduce su sueldo: ");
            sueldo = sc.nextInt();
            if (sueldo > -1) {
                sueldoIntroducidos++;
            }
        } while (sueldo != -1);

        int[] tablaSueldos = new int[sueldoIntroducidos];
        System.out.println();

        for (int i = 0; i < tablaSueldos.length; i++) {
            System.out.print("El sueldo " + (i + 1) + ": ");
            tablaSueldos[i] = sc.nextInt();
        }

        System.out.println();
        ordenar(tablaSueldos);
        System.out.println("La media de los sueldos: " + media(tablaSueldos));
        System.out.println("\nOrdenados de forma decreciente son: " + Arrays.toString(tablaSueldos));
    }
}
