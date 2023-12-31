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

    public static int busquedaDesordenada(int[] tabla, int numero) {
        int posicion = -1;
        boolean encontrado = false;

        for (int i = 0; i < tabla.length && !encontrado; i++) {
            if (tabla[i] == numero) {
                posicion = i;
                encontrado = true;
            }
        }
        return posicion;
    }

    public static int busquedaOrdenada(int[] tabla, int numero) {
        boolean encontrado = false;
        int posicion = -1, inicio = 0, fin = tabla.length - 1;

        while (inicio <= fin && !encontrado) {
            int medio = (fin + inicio) / 2;

            if (tabla[medio] == numero) {
                posicion = medio; // el numero esta en la mitad
                encontrado = true;
            }

            else if (tabla[medio] < numero) {
                inicio = medio + 1; // se quita de la izquierda al ser mayor
            } else {
                fin = medio - 1; // se quita de la derecha al ser menor
            }

        }
        return posicion;
    }

    public static int[] copiaArray(int[] tabla) {
        int[] tablaCopia = new int[tabla.length];
        
        for (int i = 0; i < tablaCopia.length; i++) {
            tablaCopia[i] = tabla[i];
        }
        return tablaCopia; // copyOf hace lo mismo
    }
}