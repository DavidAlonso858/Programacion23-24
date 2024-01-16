package examentema5;

public class ExamenTema5 {

    public static void main(String[] args) {

        int[] tabla;

        tabla = new int[aleatorioTamaño()];

        System.out.print("El tamaño de la tabla: " + tabla.length + "\n");
        rellenarArray(tabla);
        System.out.print("La tabla original: ");
        mostrar(tabla);
        ordenPrimo(tabla);
        int primo;

        primo = contadorPrimos(tabla);
        System.out.println("");
        System.out.print("La tabla final con los primos y no primos ordenados: ");
        ordenFinal(tabla, primo);
        mostrar(tabla);
    }

    public static int aleatorioTamaño() {
        int numero;

        numero = (int) (Math.random() * (15 - 5 + 1) + 5); // 5 y 15 incluidos

        return numero;
    }

    public static int aleatorio() {
        int numero;

        do {
            numero = (int) (Math.random() * (100 - 1 + 1) + 1); // 100 a 1 incluidos pero solo impares
        } while (numero % 2 == 0);

        return numero;
    }

    public static void rellenarArray(int[] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio();
        }
    }

    public static boolean esPrimo(int numero) {
        boolean primo = true; // el 1 es primo
        for (int i = 2; i <= numero / 2 && primo; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static int contadorPrimos(int[] tabla) {
        int primo = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (esPrimo(tabla[i])) {
                primo++;
            }
        }
        System.out.println("\nHay " + primo + " primos");
        System.out.println("Hay " + (tabla.length - primo) + " no primos");
        return primo;
    }

    public static void ordenPrimo(int[] tabla) {
        int posicionInicio = 0, posicionFinal = tabla.length - 1;

        while (posicionInicio < posicionFinal) {
            while (posicionInicio < tabla.length && esPrimo(tabla[posicionInicio])) {
                posicionInicio++;
            }
            while (posicionFinal >= 0 && !esPrimo(tabla[posicionFinal])) {
                posicionFinal--;
            }
            if (posicionInicio < posicionFinal) {
                int temporal = tabla[posicionInicio];
                tabla[posicionInicio] = tabla[posicionFinal];
                tabla[posicionFinal] = temporal;
            }
        }
    }

    public static void ordenFinal(int[] tabla, int numero) {
        int temporal;
        for (int i = 0; i < numero - 1; i++) { // Orden Primos de menor a mayor
            for (int j = 0; j < numero - i - 1; j++) {
                if (tabla[j] > tabla[j + 1]) {
                    temporal = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = temporal;
                }
            }
        }
        for (int i = numero; i < tabla.length - 1; i++) { // Orden No Primos de mayor a menor
            for (int j = numero; j < tabla.length - 1; j++) { // de primo al final
                if (tabla[j] < tabla[j + 1]) {
                    temporal = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = temporal;
                }
            }
        }

    }

    public static void mostrar(int[] tabla) {
        System.out.print("[ ");
        for (int i = 0; i < tabla.length; i++) {
            if (i == tabla.length - 1) {
                System.out.print(tabla[i] + " ");
            } else {
                System.out.print(tabla[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
