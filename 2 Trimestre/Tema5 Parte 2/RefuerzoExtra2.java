import java.util.Scanner;

public class RefuerzoExtra2 {

    public static int numColumnas(Scanner sc) {
        int numColumnas;
        do {
            System.out.print("Introduzca el numero de columnas (4/6): ");
            numColumnas = sc.nextInt();
        } while (numColumnas != 4 && numColumnas != 6);
        return numColumnas;
    }

    public static int aleatorioInsertar() {
        int numero;

        numero = (int) (Math.random() * (10 - 1) + 1); // incluye el 9 y 1

        return numero;
    }

    public static void insertarNumero(int[][] juegoBelen, int columnaIntroducida, int numColocar) {
        boolean insertado = false;
        for (int i = 0; i < juegoBelen.length && !insertado; i++) {
            if (juegoBelen[i][columnaIntroducida] == 0) {
                juegoBelen[i][columnaIntroducida] = numColocar;
                insertado = true;
            }
        }
    }

    public static boolean finJuego(int[][] juegoBelen, int numColumnas, int numeros) {
        boolean acabado = false;

        for (int i = 0; i < juegoBelen.length && !acabado; i++) {
            for (int j = 0; j < juegoBelen[i].length && !acabado; j++) {
                if (juegoBelen[i][j] != 0 && i == juegoBelen.length - 1 && j == juegoBelen[0].length - 1) {
                    acabado = true;
                    System.out.println("ENHORABUENA. HA COLOCADO TODOS LOS NUMEROS");
                }
            }
        }

        for (int i = 0; i < juegoBelen.length; i++) {
            for (int j = 0; j < juegoBelen[i].length - 1; j++) {
                if (juegoBelen[i][j] > juegoBelen[i][j + 1] && juegoBelen[i][j + 1] != 0) {
                    acabado = true;
                    System.out.println("FIN DEL JUEGO.");
                    numeros--;
                    System.out.println("Ha colocado " + numeros + " de " + (numColumnas * juegoBelen.length));
                }
            }
        }
        return acabado;
    }

    public static boolean avisoError(int[][] juegoBelen, int columnaIntroducida) {
        boolean completo = false;
        for (int i = 0; i < juegoBelen.length && !completo; i++) {
            if (juegoBelen[i][columnaIntroducida] != 0 && i == juegoBelen.length - 1) {
                System.out.println("''Error. La columna esta llena. Vuelve a introducir la columna''");
                completo = true;
            }
        }
        return completo;
    }

    public static void mostrar(int[][] juegoBelen, int numColumnas) {
        for (int i = 0; i < juegoBelen.length; i++) {
            for (int j = 0; j < juegoBelen[i].length; j++) {
                System.out.print("|" + juegoBelen[i][j] + "|" + "\t");
            }
            System.out.print("Fila: " + (i + 1));
            System.out.println();
        }
        if (numColumnas == 4) {
            System.out.println("---------------------------");
        } else {
            System.out.println("-------------------------------------------");
        }
        for (int columna = 0; columna < juegoBelen[0].length; columna++) {
            System.out.print("|C" + (columna + 1) + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] juegoBelen = new int[5][];
        int numColumnas, numColocar, columnaIntroducida, numeros = 0;

        numColumnas = numColumnas(sc);
        for (int i = 0; i < juegoBelen.length; i++) {
            juegoBelen[i] = new int[numColumnas];
        }
        mostrar(juegoBelen, numColumnas);

        while (!finJuego(juegoBelen, numColumnas, numeros)) {

            numColocar = aleatorioInsertar();
            System.out.println("Debe colocar el numero " + numColocar);
            do {
                System.out.print("Introduzca la columna (1 - " + numColumnas + ") donde quiere introducir el numero "
                        + numColocar + ": ");
                columnaIntroducida = sc.nextInt();
            } while (columnaIntroducida < 1 || columnaIntroducida > juegoBelen[0].length
                    || avisoError(juegoBelen, columnaIntroducida - 1));
            numeros++;
            insertarNumero(juegoBelen, columnaIntroducida - 1, numColocar);

            mostrar(juegoBelen, numColumnas);
        }

    }
}
