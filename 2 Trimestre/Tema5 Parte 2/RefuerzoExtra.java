import java.util.Scanner;

public class RefuerzoExtra {

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

    public static void cambiarColor(char[][] conectaCuatro, char turno, int columna) {
        int filaEncontrada = 0;
        for (int filaRecorrido = 0; filaRecorrido < conectaCuatro[0].length; filaRecorrido++) {
            if (conectaCuatro[filaRecorrido][columna] == turno) {
                filaEncontrada = filaRecorrido;
            }
        }

        if ((filaEncontrada > 0) && (columna > 0) && (conectaCuatro[filaEncontrada - 1][columna - 1] != turno)
                && (conectaCuatro[filaEncontrada - 1][columna - 1] != 'X')) { // cuadrado arriba izquierda

            conectaCuatro[filaEncontrada - 1][columna - 1] = turno;
        }
        if ((filaEncontrada > 0) && (columna < conectaCuatro[filaEncontrada].length - 1)
                && (conectaCuatro[filaEncontrada - 1][columna + 1] != turno)
                && (conectaCuatro[filaEncontrada - 1][columna + 1] != 'X')) { // cuadrado arriba derecha

            conectaCuatro[filaEncontrada - 1][columna + 1] = turno;
        }
        if ((columna > 0) && (conectaCuatro[filaEncontrada][columna - 1] != turno)
                && (conectaCuatro[filaEncontrada][columna - 1] != 'X')) { // cuadrado izquierda

            conectaCuatro[filaEncontrada][columna - 1] = turno;
        }
        if ((columna < conectaCuatro[filaEncontrada].length - 1)
                && (conectaCuatro[filaEncontrada][columna + 1] != turno)
                && (conectaCuatro[filaEncontrada][columna + 1] != 'X')) { // cuadrado derecha

            conectaCuatro[filaEncontrada][columna + 1] = turno;
        }
        if ((filaEncontrada < conectaCuatro[filaEncontrada].length - 1)
                && (conectaCuatro[filaEncontrada + 1][columna] != turno)
                && (conectaCuatro[filaEncontrada + 1][columna] != 'X')) { // cuadrado abajo

            conectaCuatro[filaEncontrada + 1][columna] = turno;
        }
        if ((filaEncontrada > 0) && (conectaCuatro[filaEncontrada - 1][columna] != turno)
                && (conectaCuatro[filaEncontrada - 1][columna] != 'X')) { // cuadrado arriba

            conectaCuatro[filaEncontrada - 1][columna] = turno;
        }
        if ((filaEncontrada < conectaCuatro[filaEncontrada].length - 1)
                && (columna < conectaCuatro[filaEncontrada].length - 1)
                && (conectaCuatro[filaEncontrada + 1][columna + 1] != turno)
                && (conectaCuatro[filaEncontrada + 1][columna + 1] != 'X')) { // cuadrado abajo derecha

            conectaCuatro[filaEncontrada + 1][columna + 1] = turno;
        }
        if ((filaEncontrada < conectaCuatro[filaEncontrada].length - 1)
                && (columna > 0 && columna < conectaCuatro[filaEncontrada].length - 1)
                && (conectaCuatro[filaEncontrada + 1][columna - 1] != turno)
                && (conectaCuatro[filaEncontrada + 1][columna - 1] != 'X')) { // cuadrado abajo izquierda

            conectaCuatro[filaEncontrada + 1][columna - 1] = turno;
        }

    }

    public static void mostrarReversi(char[][] conectaCuatro) {
        int rojas = 0, azules = 0;
        for (int i = 0; i < conectaCuatro.length; i++) {
            System.out.print("\t  ");
            for (int j = 0; j < conectaCuatro[i].length; j++) {
                System.out.print(conectaCuatro[i][j] + "\t");
                if (conectaCuatro[i][j] == 'R') {
                    rojas++;
                } else if (conectaCuatro[i][j] == 'A') {
                    azules++;
                }
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] conectaCuatro;
        int dimension, columnaRojo, columnaAzul;
        char turno;
        System.out.println("Bienvenido al Conecta 4");

        dimension = dimensionJuego(sc);
        conectaCuatro = new char[dimension][dimension];
        rellanarMatriz(conectaCuatro);

        System.out.println();
        mostrarReversi(conectaCuatro);

        while (!finJuego(conectaCuatro)) {

            System.out.println("\nTurno Jugador Rojo.");
            System.out.print("Introduce la columna de la ficha a insertar: ");
            columnaRojo = sc.nextInt();
            turno = 'R';

            if (insertarFichaEnColumna(conectaCuatro, columnaRojo - 1, turno)) {
                System.out.println();
                cambiarColor(conectaCuatro, turno, columnaRojo - 1);
                mostrarReversi(conectaCuatro); // mostrar en cada jugada
            }

            System.out.println("\nTurno Jugador Azul.");
            System.out.print("Introduce la columna de la ficha a insertar: ");
            columnaAzul = sc.nextInt();
            turno = 'A';
            if (insertarFichaEnColumna(conectaCuatro, columnaAzul - 1, turno)) {
                System.out.println();
                cambiarColor(conectaCuatro, turno, columnaAzul - 1);
                mostrarReversi(conectaCuatro); // mostrar en cada jugada
            }
        }
        System.out.println("\nFin del Conecta 4. Espero que haya ido todo bien");
    }
}
