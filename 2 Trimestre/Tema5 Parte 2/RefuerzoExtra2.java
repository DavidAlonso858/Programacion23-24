import java.util.Scanner;

public class RefuerzoExtra2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] juegoBelen = new int[5][];
        int numColumnas, numAleatorio, columna = 1, numeros = 0;

        numColumnas = dimension(sc);
        for (int i = 0; i < juegoBelen.length; i++) {
            juegoBelen[i] = new int[numColumnas];
        }
        mostrar(juegoBelen, numColumnas);

        while (!finJuego(juegoBelen, columna - 1, numeros, numColumnas)) {
            numAleatorio = numAleatorio();
            do {
                System.out.println("Debe colocar el numero " + numAleatorio);
                System.out.print("Introduzca la columna (1 - " + numColumnas + ") donde quiere introducir el numero "
                        + numAleatorio + ": ");
                columna = sc.nextInt();
            } while (columna < 1 || columna > juegoBelen[0].length || avisoError(juegoBelen, columna - 1));

            insertar(juegoBelen, columna - 1, numAleatorio);
            numeros++;

            mostrar(juegoBelen, numColumnas);
        }
    }

    public static int dimension(Scanner sc) {
        int dimension;

        do {
            System.out.print("Introduzca el numero de columnas (4/6): ");
            dimension = sc.nextInt();
        } while (dimension != 4 && dimension != 6);

        return dimension;
    }

    public static int numAleatorio() {
        int numero;

        numero = (int) (Math.random() * (9 - 2) + 2);

        return numero;
    }

    public static void insertar(int[][] juegoBelen, int columna, int numAleatorio) {
        boolean introducido = false;
        for (int i = 0; i < juegoBelen.length && !introducido; i++) {
            if (juegoBelen[i][columna] == 0) {
                juegoBelen[i][columna] = numAleatorio;
                introducido = true;
            }
        }
    }

    public static boolean finJuego(int[][] juegoBelen, int columna, int numeros, int numColumnas) {
        boolean acabado = true;
        int filaUltima = juegoBelen.length - 1;
        for (int j = 0; j < juegoBelen[0].length && acabado; j++) {
            if (juegoBelen[filaUltima][j] == 0) {
                acabado = false;
            }
        }
        if (acabado) {
            System.out.println("ENHORABUENA. HAS COLOCADO TODOS LOS NUMEROS");
        } else {
            for (int i = 0; i < juegoBelen.length && !acabado; i++) {
                if (columna > 0 && columna < juegoBelen[0].length - 1) {
                    // Verificar condiciones en el centro de la fila
                    if (juegoBelen[i][columna - 1] != 0 && juegoBelen[i][columna] < juegoBelen[i][columna - 1] && juegoBelen[i][columna] > juegoBelen[i][columna + 1]) {
                        acabado = true;
                        numeros--;
                        System.out.println("Final del Juego patata1");
                        System.out
                                .println("Ha colocado " + numeros + " numeros de " + (juegoBelen.length * numColumnas));
                    }

                 /*  if (juegoBelen[i][columna + 1] != 0 ) {
                        acabado = true;
                        numeros--;
                        System.out.println("Final del Juego patata");
                        System.out
                                .println("Ha colocado " + numeros + " numeros de " + (juegoBelen.length * numColumnas));
                 }*/
                    
                }

                if (columna == 0 && juegoBelen[i][columna] > juegoBelen[i][columna + 1]
                        && juegoBelen[i][columna + 1] != 0) {
                    // Verificar condiciones en el extremo izquierdo de la fila
                    acabado = true;
                    numeros--;
                    System.out.println("Final del Juego albondiga");
                    System.out.println("Ha colocado " + numeros + " numeros de " + (juegoBelen.length * numColumnas));
                }

                if (columna == juegoBelen[0].length
                        && juegoBelen[i][columna] < juegoBelen[i][columna - 1] && juegoBelen[i][columna - 1] != 0) {
                    // Verificar condiciones en el extremo derecho de la fila
                    acabado = true;
                    numeros--;
                    System.out.println("Final del Juego");
                    System.out.println("Ha colocado " + numeros + " numeros de " + (juegoBelen.length * numColumnas));
                }
            }
        }
        return acabado;
    }

    public static boolean avisoError(int[][] juegoBelen, int columna) {
        boolean aviso = false;
        for (int i = 0; i < juegoBelen.length; i++) {
            if (juegoBelen[i][columna] != 0 && i == juegoBelen.length - 1) {
                aviso = true;
                System.out.println("Error. La columna esta llena. Vuelva a introducir el numero");
            }
        }
        return aviso;
    }

    public static void mostrar(int[][] juegoBelen, int numColumnas) {
        for (int i = 0; i < juegoBelen.length; i++) {
            for (int j = 0; j < juegoBelen[i].length; j++) {
                System.out.print("|" + juegoBelen[i][j] + "|" + "\t");
            }
            System.out.println("");
        }
        if (numColumnas == 4) {
            System.out.println("---------------------------");
        } else {
            System.out.println("-------------------------------------------");
        }
        for (int Columnas = 0; Columnas < juegoBelen[0].length; Columnas++) {
            System.out.print("|C" + (Columnas + 1) + "\t");
        }
        System.out.println("");
    }
}
