import java.util.Scanner;

public class Ejercicio53 {

    public static void mostrarArray(int[] tabla) {
        System.out.println("\nLos numeros introducidos en orden inverso es: ");
        for (int recorrido = tabla.length - 1; recorrido >= 0; recorrido--) {
            System.out.println(tabla[recorrido]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce la cantidad: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        int[] tabla = new int[numero];

        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Introduzca numero: ");
            tabla[i] = sc.nextInt();
        }

        mostrarArray(tabla);
    }
}
