import java.util.Arrays;
import java.util.Scanner;

public class Refuerzo17Rotar {

    public static int aleatorio() {
        int numero;

        numero = (int) (Math.random() * (100 - 0 + 1));

        return numero;
    }

    public static int[] contenidoArray(int[] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio();
        }
        return tabla;
    }

    public static boolean comprobarEncuentro(int[] tabla, int numero) {
        boolean encontrado = false;
        for (int i : tabla) {
            if (i == numero && !encontrado) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static int[] tablaRotada(int[] tabla, int numero) {
        int temporal, posicionFinal;

        while (tabla[0] != numero) {
            posicionFinal = tabla[tabla.length - 1]; // para que no se pierda el ultuno numero
            for (int i = tabla.length - 1; i > 0; i--) { // empezar desde el ultimo para rotar derecha
                temporal = tabla[i - 1];
                tabla[i] = temporal;
            }
            tabla[0] = posicionFinal;
        }
        return tabla;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];
        int numero;
        System.out.println(Arrays.toString(contenidoArray(tabla)));

        do {
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();

            if (comprobarEncuentro(tabla, numero) == false) {
                System.out.println("No se encuentra en el array");
            }
        } while (comprobarEncuentro(tabla, numero) == false);

        System.out
                .println("La tabla rotada con vuestro numero primero: " + Arrays.toString(tablaRotada(tabla, numero)));
    }
}