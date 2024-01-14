import java.util.Scanner;

public class RepasoExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tabla;

        tabla = new int[aleatorioTamaño()];

        System.out.println(tabla.length);
        rellenarArray(tabla);

        int primos = 0, primosNo = 0;

        ordenPrimo(tabla); // ordeno primos-noprimos
        primos = contadorPrimo(tabla); // cuento la cantidad de xprimos
        primosNo = contadorNoPrimos(tabla); // cuento la cantidad de no primos

        System.out.println();
        ordenFinal(tabla, primos, primosNo); // ordeno tanto uno como otro de forma asc-desc
        System.out.print("La tabla final ordenada es: ");
        mostrar(tabla);
    }

    public static int aleatorioTamaño() {
        int numero;

        numero = (int) (Math.random() * (15 - 6) + 6); // excluye el 5 y el 15

        return numero;
    }

    public static int aleatorio() {
        int numero;

        do {
            numero = (int) (Math.random() * (100 - 2) + 2);
        } while (numero % 2 == 0);

        return numero;
    }

    public static int[] rellenarArray(int[] tabla) {

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio();
        }
        return tabla;
    }

    public static boolean esPrimo(int numero) {
        boolean primo = true;
        for (int i = 2; i <= numero / 2 && primo; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }
        return primo;
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

    public static void ordenPrimo(int[] tabla) {
        int posicion = 0;
        int posicionFinal = tabla.length - 1;

        for (int i = 0; i < tabla.length; i++) {
            if (esPrimo(tabla[i]) == true) {
                tabla[posicion++] = tabla[i];
            } else {
                tabla[posicionFinal--] = tabla[i];
            }
        }
    }

    public static int contadorPrimo(int[] tabla) {
        int primos = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (esPrimo(tabla[i])) {
                primos++;
            }
        }
        System.out.println("El numero de primos es: " + primos);
        return primos;
    }

    public static int contadorNoPrimos(int[] tabla) {
        int primosNo = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (!esPrimo(tabla[i])) {
                primosNo++;
            }
        }
        System.out.println("El numero de no primos es: " + primosNo);
        return primosNo;
    }

    public static void ordenFinal(int[] tabla, int primos, int primosNo) {
        int[] tablaPrimos = new int[primos];
        int[] tablaNoPrimos = new int[primosNo];

        int rellenar = 0;
        for (int i = 0; i < tablaPrimos.length; i++) {
            tablaPrimos[i] = tabla[rellenar++];
        }
        for (int i = 0; i < tablaNoPrimos.length; i++) {
            tablaNoPrimos[i] = tabla[rellenar++];
        }

        ordenAscendente(tablaPrimos);
        ordenDescendente(tablaNoPrimos);

        int indice = 0;

        for (int recorrerPrimos : tablaPrimos) {
            tabla[indice++] = recorrerPrimos;
        }
        for (int recorrerNoPrimos : tablaNoPrimos) {
            tabla[indice++] = recorrerNoPrimos;
        }
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
}
