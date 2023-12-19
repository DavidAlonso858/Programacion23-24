import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio519 {
    public static int[] insercion(int[] tabla, int dorsal) {
        int[] nuevo = Arrays.copyOf(tabla, tabla.length + 1);
        nuevo[nuevo.length - 1] = dorsal;
        return nuevo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[0];
        int dorsal;
        System.out.println("Muestra de los corredores que han llegado a la meta. Introduce -1 cuando esten todos.\n");
        
        do {
            System.out.print("Introduzca el dorsal del corredor: ");
            dorsal = sc.nextInt();
            if (dorsal != -1) {
                tabla = insercion(tabla, dorsal);
            }
        } while (dorsal != -1);

        System.out.println(Arrays.toString(tabla));
    }
}
