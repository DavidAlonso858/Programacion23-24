
public class RepasoExtra2 {
    public static void main(String[] args) {
        int[] tabla;

        tabla = new int[aleatorioTamaño()];

        System.out.println("Tamaño de la tabla: " + tabla.length);
        rellenarArray(tabla);
        tabla = ordenMultiplo(tabla);

        int multiplos, noMultiplos;

        multiplos = contadorMultiplos(tabla);
        noMultiplos = contadorNoMultiplos(tabla);

        ordenFinal(tabla, multiplos, noMultiplos);
        System.out.print("La tabla final con los multiplos y no multiplos ordenados: ");
        mostrar(tabla);

    }

    public static int aleatorioTamaño() {
        int numero;

        numero = (int) (Math.random() * (15 - 11) + 11);

        return numero;
    }

    public static boolean repetidos(int[] tabla, int numero) {
        boolean encontrado = false;

        for (int i = 0; i < tabla.length && !encontrado; i++) {
            if (tabla[i] == numero) {
                return encontrado = true;
            }
        }
        return encontrado;
    }

    public static int aleatorio(int[] tabla) {
        int numero;

        do {
            numero = (int) (Math.random() * (100 - 2) + 2);
        } while (repetidos(tabla, numero));

        return numero;
    }

    public static int[] rellenarArray(int[] tabla) {

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio(tabla);
        }

        return tabla;
    }

    public static boolean multiplo3(int numero) {
        boolean multiplo = false;

        if (numero % 3 == 0) {
            multiplo = true;
        }
        return multiplo;
    }

    public static int[] ordenMultiplo(int[] tabla) {
        int[] tablaOrdenada = new int[tabla.length];
        int posicion = 0, posicionFinal = tablaOrdenada.length - 1;

        for (int i = 0; i < tabla.length; i++) {
            if (multiplo3(tabla[i])) {
                tablaOrdenada[posicion++] = tabla[i];
            } else {
                tablaOrdenada[posicionFinal--] = tabla[i];
            }
        }
        return tablaOrdenada;
    }

    public static int contadorMultiplos(int[] tabla) {
        int multiplos = 0;

        for (int recorrerTabla : tabla) {
            if (multiplo3(recorrerTabla)) {
                multiplos++;
            }
        }
        System.out.println("Hay " + multiplos + " multiplos");

        return multiplos;
    }

    public static int contadorNoMultiplos(int[] tabla) {
        int multiplos = 0;

        for (int recorrerTabla : tabla) {
            if (!multiplo3(recorrerTabla)) {
                multiplos++;
            }
        }
        System.out.println("Hay " + multiplos + " no multiplos");

        return multiplos;
    }

    public static void ordenAscendente(int[] tabla) {
        int temporal;

        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = 0; j < tabla.length - i - 1; j++) {
                if (tabla[j] > tabla[j + 1]) {
                    temporal = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = temporal;
                }
            }
        }
    }

    public static void ordenDescendente(int[] tabla) {
        int temporal;

        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = 0; j < tabla.length - i - 1; j++) {
                if (tabla[j] < tabla[j + 1]) {
                    temporal = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = temporal;
                }
            }
        }
    }

    public static void ordenFinal(int[] tabla, int multiplos, int noMultiplos) {
        int[] tablaMultiplos = new int[multiplos];
        int[] tablaNoMultiplos = new int[noMultiplos];

        int recorrido = 0;

        for (int i = 0; i < tablaMultiplos.length; i++) {
            tablaMultiplos[i] = tabla[recorrido++];
        }
        for (int i = 0; i < tablaNoMultiplos.length; i++) {
            tablaNoMultiplos[i] = tabla[recorrido++];
        }
        ordenAscendente(tablaMultiplos);
        ordenDescendente(tablaNoMultiplos);

        int indice = 0;

        for (int recorrerMultiplos : tablaMultiplos) {
            tabla[indice++] = recorrerMultiplos;
        }
        for (int recorrerNoMultiplos : tablaNoMultiplos) {
            tabla[indice++] = recorrerNoMultiplos;
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
