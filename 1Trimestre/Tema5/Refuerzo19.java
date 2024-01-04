import java.util.Arrays;
import java.util.Scanner;

public class Refuerzo19 {

    public static int aleatorio() {
        int numero;

        numero = (int) (Math.random() * (200 - 0 + 1));

        return numero;
    }

    public static void indice(int[] tabla) {
        System.out.print("Indice ");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(i + "    ");
        }
    }

    public static int[] rellenarArray(int[] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio();
        }
        return tabla;
    }

    public static int[] tablaResuelta(int[] tabla, int numero, int posicion) {
        int temporal;
        for (int i = tabla.length - 1; i >= posicion; i--) {
            if (i == 0 || posicion == tabla.length - 1) { // si introduce la posicion 0 no se sale o 11 no cambia nada
                tabla[i] = numero;
            } else { // rota
                temporal = tabla[i - 1];
                tabla[i] = temporal;
            }
        }
        tabla[posicion] = numero; // introduce el numero
        return tabla;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[12];
        int numero, posicion;

        System.out.println("Array original:\n");
        indice(tabla);
        System.out.println("\nValor " + Arrays.toString(rellenarArray(tabla)));

        System.out.print("\nIntroduzca el numero que quiere insertar: ");
        numero = sc.nextInt();

        do {
            System.out.print("Introduzca la posicion donde lo quiere insertar (0-11): ");
            posicion = sc.nextInt();
        } while (posicion < 0 || posicion > 11);
        
        System.out.println("\nArray resultado:\n");
        indice(tabla);
        System.out.println("\nValor " + Arrays.toString(tablaResuelta(tabla, numero, posicion)));
    }
}
