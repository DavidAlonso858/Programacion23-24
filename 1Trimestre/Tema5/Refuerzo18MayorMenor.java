import java.util.Arrays;
import java.util.Scanner;

public class Refuerzo18MayorMenor {

    public static int aleatorio() {
        int numero;

        numero = (int) (Math.random() * (200 - 0 + 1));

        return numero;
    }

    public static void indiceTablas(int[] tabla) {
        System.out.print("Indice ");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(i + " ");
        }
    }

    public static int[] rellenarArray(int[] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio();
        }
        return tabla;
    }

    public static int[] tablaMenorMayor(int[] tabla) {
        int contMenor = 0;
        int contMayor = 0;
        int[] menor = new int[tabla.length];
        int[] mayor = new int[tabla.length];
        int[] tablaResultado = new int[tabla.length];
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] < 100) {
                menor[contMenor++] = tabla[i];
            } else {
                mayor[contMayor++] = tabla[i];
            }
        }
        int indice = 0;
        int menorResultado = 0;
        int mayorResultado = 0;
        while (indice < tabla.length) {
            if (menorResultado < contMenor) {
                tablaResultado[indice++] = menor[menorResultado++];
            }
            if (mayorResultado < contMayor) {
                tablaResultado[indice++] = mayor[mayorResultado++];
            }
        }
        return tablaResultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];

        System.out.println("Array original: ");
        indiceTablas(tabla);
        System.out.println("\nValor " + Arrays.toString(rellenarArray(tabla)));
        System.out.println("\nArray resultado: ");
        indiceTablas(tabla);
        System.out.println("\nValor " + Arrays.toString(tablaMenorMayor(tabla)));
    }
}
