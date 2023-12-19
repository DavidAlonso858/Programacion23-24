import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio520 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla1 = { 5, 6, 7, 8, 9 };
        int[] tabla2 = { 4, 10, 16, 18, 20 };

        System.out.println("Las dos tablas fusionadas: "+Arrays.toString(fusionTablas(tabla1, tabla2)));
    }

    public static int[] fusionTablas(int[] tabla1, int[] tabla2) {
        int[] tablaFusion = new int[tabla1.length + tabla2.length];
        int i = 0, j = 0, indice = 0;

        // decidir el orden
        while (i < tabla1.length && j < tabla2.length) {
            if (tabla1[i] < tabla2[j]) {
                tablaFusion[indice] = tabla1[i];
                indice++;
                i++;
            } else {
                tablaFusion[indice] = tabla2[j];
                indice++;
                j++;
            }
        }
        // Lo que sobra
        while (i < tabla1.length) {
            tablaFusion[indice] = tabla1[i];
            indice++;
            i++;
        }

        // Lo que sobra 2
        while (j < tabla2.length) {
            tablaFusion[indice] = tabla2[j];
            indice++;
            j++;
        }
        return tablaFusion;
    }
}
