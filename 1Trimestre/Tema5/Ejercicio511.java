import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio511 {

    public static int[] buscarTodos(int[] t, int clave) {

        int contador = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contador++;
            }
        }

        int[] tablaNueva = new int[contador];
        contador = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                tablaNueva[contador] = i;
                contador++;
            }
        }

        return tablaNueva;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave = 8;
        int[] t = { 3, 6, 6, 8 };

        System.out.println(Arrays.toString(buscarTodos(t, clave)));
    }
}
