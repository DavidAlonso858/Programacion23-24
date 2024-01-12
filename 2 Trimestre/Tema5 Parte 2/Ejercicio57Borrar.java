import java.util.Scanner;

public class Ejercicio57Borrar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla;
        int n;

        do {
            System.out.print("¿Cuantos numeros favoritos tienes? (al menos 2): ");
            n = sc.nextInt();
        } while (n < 2);

        tabla = new int[n];
        rellenarArray(tabla, sc);
        mostrar(tabla);
    }

    public static int[] rellenarArray(int[] tabla, Scanner sc) {
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Introduce numero: ");
            tabla[i] = sc.nextInt();
        }
        return tabla;
    }

    public static void mostrar(int[] tabla) {
        System.out.print("[ ");
        for (int i = 0; i < tabla.length; i++) {
            if (i == tabla.length - 1) {
                System.out.print(tabla[i] + " ");
            } else
                System.out.print(tabla[i] + ", ");
        }
        System.out.print("]");
    }

    public static int aleatorio(int[] tabla) {
        int numero;

        numero = (int) Math.random() * (tabla.length);

        return numero;
    }
}
