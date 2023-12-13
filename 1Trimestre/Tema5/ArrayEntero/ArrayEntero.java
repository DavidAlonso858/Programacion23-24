package ArrayEntero;

public class ArrayEntero {

    public static void pintarTabla(int[] tabla) {
        for (int valor : tabla) {

            System.out.println(valor);
        }
    }

    public static void pintarTabla(int[] tabla, int desde, int hasta) {
        for (int i = desde; i <= hasta; i++) {
            System.out.println(tabla[i]);

        }
    }

    public static void fill(int[] tabla, int valor) {

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = valor;
        }

    }

    public static void fill(int[] tabla, int desde, int hasta, int valor) {

        for (int i = desde; i <= hasta; i++) {
            tabla[i] = valor;
        }
    }

    public static void ordenar(int[] tabla) { // Burbuja
        int temp;
        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = 0; j < tabla.length - 1 - i; j++) {
                if (tabla[j] > tabla[j + 1]) {
                    temp = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = temp;
                }
            }
        }
        for (int recorrido : tabla) {
            System.out.print(recorrido + " ");
        }
    }

    public static void insercionDirecta(int[] array) { // Insercion Directa
        int elemento, j;
        for (int i = 1; i < array.length; i++) { // la j trabaja con la posicion 0
            elemento = array[i];
            j = i - 1;
            for (; j >= 0 && array[j] > elemento; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = elemento; // le asigna la posicion sobrante al numero
        }
    }

    public static void seleccionDirecta(int[] array) { // Seleccion Directa
        int menor, temporal;
        for (int i = 0; i < array.length - 1; i++) {
            menor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }
            temporal = array[menor];
            array[menor] = array[i];
            array[i] = temporal;
        }
    }
}
