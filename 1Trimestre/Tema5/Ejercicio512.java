import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio512 {

    public static int aleatorio(int[] t) {
        int numero;
        numero = (int) (Math.random() * (t.length - 1));

        return numero;
    }

    public static void desordenar(int[] t) {
        System.out.println("La tabla desordenada: ");
        for (int i = 0; i < t.length; i++) {
            int camnbioPosicion = aleatorio(t);
            int temporal = t[i];
            t[i] = t[camnbioPosicion]; // valor de aleatorio en el i
            t[camnbioPosicion] = temporal; // valor de i en el aleatorio
        }
        System.out.println(Arrays.toString(t));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = { 2, 4, 6, 8 };
        System.out.println(Arrays.toString(tabla));
        
        desordenar(tabla);

    }

}
