import java.util.Scanner;

public class Refuerzo13 {

    public static int aleatorio() {
        int numero;

        numero = (int) (Math.random() * (500 - 0 + 1));

        return numero;
    }

    public static void rellenarArray(int[] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio();
            System.out.print(tabla[i] + " ");
        }
    }

    public static void minimo(int[] tabla) {
        int minimo = Integer.MAX_VALUE;
        for (int i : tabla) { // saco primero el minimo y luego escribo
            if (i < minimo) {
                minimo = i;
            }
        }
        for (int i : tabla) {
            if (i == minimo) {
                System.out.print("''" + i + "'' ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void maximo(int[] tabla) {
        int maximo = Integer.MIN_VALUE;
        for (int i : tabla) {
            if (i > maximo) {
                maximo = i;
            }
        }
        for (int i : tabla) {
            if (i == maximo) {
                System.out.print("''" + i + "'' ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[100];
        int opcion;

        System.out.println("La tabla con los elementos: ");
        rellenarArray(tabla);

        System.out.print("\n\n¿Que quiere destacar? (1-minimo, 2-maximo): ");
        opcion = sc.nextInt();
        System.out.println();

        switch (opcion) {
            case 1 -> minimo(tabla);
            case 2 -> maximo(tabla);

            default -> System.out.println("Fallo al elegir");
        }
    }
}
