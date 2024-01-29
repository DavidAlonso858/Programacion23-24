import java.util.Scanner;

public class RefuerzoExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] conectaCuatro;
        int dimension, columnaRojo, columnaAzul, rojas = 0, azules = 0;
        char turno;
        System.out.println("Bienvenido al Conecta 4");

        dimension = dimensionJuego(sc);
        conectaCuatro = new char[dimension][dimension];
        rellanarMatriz(conectaCuatro);

        System.out.println();
        mostrarReversi(conectaCuatro, rojas, azules);

        while (!finJuego(conectaCuatro)) {

            System.out.println("\nTurno Jugador Rojo.");
            System.out.print("Introduce la columna de la ficha a insertar: ");
            columnaRojo = sc.nextInt();
            turno = 'R';

            if (insertarFichaEnColumna(conectaCuatro, columnaRojo - 1, turno)) {
                rojas++;
                System.out.println();
                mostrarReversi(conectaCuatro, rojas, azules); // mostrar en cada jugada
            }

            System.out.println("\nTurno Jugador Azul.");
            System.out.print("Introduce la columna de la ficha a insertar: ");
            columnaAzul = sc.nextInt();
            turno = 'A';
            if (insertarFichaEnColumna(conectaCuatro, columnaAzul - 1, turno)) {
                azules++;
                System.out.println();
                mostrarReversi(conectaCuatro, rojas, azules); // mostrar en cada jugada
            }
        }
        System.out.println("\nFin del Conecta 4. Espero que haya ido todo bien");
    }

    public static int dimensionJuego(Scanner sc) {
        int dimension;
        do {
            System.out.print("Introduzca la dimension del tablero de 4 a 8: ");
            dimension = sc.nextInt();
        } while (dimension < 4 || dimension > 8);

        return dimension;
    }

    public static void rellanarMatriz(char[][] conectaCuatro) {
        for (int i = 0; i < conectaCuatro.length; i++) {
            for (int j = 0; j < conectaCuatro[i].length; j++) {
                conectaCuatro[i][j] = 'X';
            }
        }
    }

    public static boolean insertarFichaEnColumna(char[][] conectaCuatro, int columna, char turno) {
        boolean fichaIntroducida = false;
        if (columna < 0 || columna > conectaCuatro[0].length - 1) {
            System.out.println("''Error al introducir el dato. Se salta su turno.''");
        } else
            for (int fila = conectaCuatro[0].length - 1; fila >= 0 && !fichaIntroducida; fila--) {
                if (conectaCuatro[fila][columna] == 'X') {
                    conectaCuatro[fila][columna] = turno;
                    fichaIntroducida = true;
                    System.out.println("''Se ha podido introducir''");
                } else if (fila == 0 && conectaCuatro[fila][columna] != 'X' && !fichaIntroducida) {
                    System.out.println("''La columna que has selecionado esta llena. Se salta su turno.''");
                }
            }
        return fichaIntroducida;
    }

    public static boolean finJuego(char[][] conectaCuatro) {
        boolean acabado = true;
        for (int i = 0; i < conectaCuatro.length && acabado; i++) {
            for (int j = 0; j < conectaCuatro[i].length && acabado; j++) {
                if (conectaCuatro[i][j] == 'X') {
                    acabado = false;
                }
            }
        }
        return acabado;
    }

    public static void mostrarReversi(char[][] conectaCuatro, int rojas, int azules) {
        for (int i = 0; i < conectaCuatro.length; i++) {
            System.out.print("\t  ");
            for (int j = 0; j < conectaCuatro[i].length; j++) {
                System.out.print(conectaCuatro[i][j] + "\t");
            }
            System.out.print("Fila: " + (i + 1));
            System.out.println();
        }
        System.out.print("Columnas: ");
        for (int columnas = 0; columnas < conectaCuatro[0].length; columnas++) {
            System.out.print((columnas + 1) + "\t");
        }

        System.out.println("\n\nHay " + rojas + " fichas rojas");
        System.out.println("Hay " + azules + " fichas azules");
    }
}
