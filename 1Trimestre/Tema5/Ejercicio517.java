import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio517 {

    public static int[] suma(int t[], int numElementos) {
        int[] nuevo = new int[(t.length - numElementos) + 1];

        for (int indice = 0; indice < nuevo.length; indice++) {

            for (int recorrido = 0; recorrido < numElementos; recorrido++) {

                nuevo[indice] += t[indice + recorrido];
            }
        }
        return nuevo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = { 10, 1, 5, 8, 9, 2 };
        int numElementos = 3;

        System.out.println(Arrays.toString(suma(t, numElementos)));
    }
}
