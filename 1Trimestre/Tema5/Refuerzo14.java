import java.util.Arrays;
import java.util.Scanner;

public class Refuerzo14 {

    public static String[] tablaColores(String[] tablaOriginal) {
        String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
        String[] tablaResultado = new String[tablaOriginal.length];
        int coloresPrimero = 0, noColores = tablaResultado.length - 1;
        boolean encontrado;

        for (int i = 0; i < tablaOriginal.length; i++) {
            encontrado = false;
            for (int j = 0; j < colores.length && !encontrado; j++) { // rastreo los colores
                if (tablaOriginal[i].equals(colores[j])) { // equals para comparar strings
                    tablaResultado[coloresPrimero] = tablaOriginal[i];
                    coloresPrimero++;
                    encontrado = true;
                }
            }
            if (!encontrado) {
                tablaResultado[noColores] = tablaOriginal[i];
                noColores--;
            }
        }

        return tablaResultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tablaOriginal = new String[8];

        for (int i = 0; i < tablaOriginal.length; i++) {
            System.out.print("Introduzca una palabra (colores y no colores): ");
            tablaOriginal[i] = sc.next();
        }
        System.out.println("\nArray original: " + Arrays.toString(tablaOriginal));
        System.out.println("Array resultado: " + Arrays.toString(tablaColores(tablaOriginal)));
    }

}
