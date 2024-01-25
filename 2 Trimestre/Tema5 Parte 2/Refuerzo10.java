import java.util.Scanner;

public class Refuerzo10 {

    public static boolean ganadorX(String[][] tabla, String X) {
        boolean ganador = false;

        ganador = ((tabla[0][0] == X) && (tabla[0][1] == X) && (tabla[0][2] == X) // fila1
                ||
                (tabla[1][0] == X) && (tabla[1][1] == X) && (tabla[1][2] == X) // fila2
                ||
                (tabla[2][0] == X) && (tabla[2][1] == X) && (tabla[2][2] == X) // fila3
                ||
                (tabla[0][0] == X) && (tabla[1][0] == X) && (tabla[2][0] == X) // columna1
                ||
                (tabla[0][1] == X) && (tabla[1][1] == X) && (tabla[2][1] == X) // columna2
                ||
                (tabla[0][2] == X) && (tabla[1][2] == X) && (tabla[2][2] == X) // columna3
                ||
                (tabla[0][0] == X) && (tabla[1][1] == X) && (tabla[2][2] == X) // diagonal1
                ||
                (tabla[0][2] == X) && (tabla[1][1] == X) && (tabla[2][0] == X)); // diagonal2

        return ganador;
    }

    public static boolean ganadorO(String[][] tabla, String O) {
        boolean ganador = false;

        ganador = ((tabla[0][0] == O) && (tabla[0][1] == O) && (tabla[0][2] == O) // fila1
                ||
                (tabla[1][0] == O) && (tabla[1][1] == O) && (tabla[1][2] == O) // fila2
                ||
                (tabla[2][0] == O) && (tabla[2][1] == O) && (tabla[2][2] == O) // fila3
                ||
                (tabla[0][0] == O) && (tabla[1][0] == O) && (tabla[2][0] == O) // columna1
                ||
                (tabla[0][1] == O) && (tabla[1][1] == O) && (tabla[2][1] == O) // columna2
                ||
                (tabla[0][2] == O) && (tabla[1][2] == O) && (tabla[2][2] == O) // columna3
                ||
                (tabla[0][0] == O) && (tabla[1][1] == O) && (tabla[2][2] == O) // diagonal1
                ||
                (tabla[0][2] == O) && (tabla[1][1] == O) && (tabla[2][0] == O)); // diagonal2

        return ganador;
    }

    public static void resultado(String[][] tabla, boolean ganadorX, boolean ganadorO) {
        if (ganadorX) {
            System.out.println("\nEnhorabuena, ha ganado el Jugador 1 con sus increible jugada con las X");
        } else if (ganadorO) {
            System.out.println("\nEnhorabuena, ha ganado el Jugador 2 con sus increible jugada con los O");
        } else
            System.out.println("\nEmpate en este reñido duelo de titanes");
    }

    public static void mostrar(String[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = "X";
        String O = "O";
        String[][] tabla = new String[3][3];
        int filaX, columnaX, filaO, columnaO, turnos = 0;

        while (!ganadorO(tabla, O) && !ganadorX(tabla, X) && turnos != 9) {
            System.out.println();
            mostrar(tabla);
            System.out.println();

            System.out.println("Turno Jugador 1");
            do {
                System.out.print("En que fila introduces la X: ");
                filaX = sc.nextInt();
                System.out.print("En que columna introduces la X: ");
                columnaX = sc.nextInt();

            } while (filaX > 3 || columnaX > 3 || columnaX < 1 || filaX < 1);
            tabla[filaX - 1][columnaX - 1] = X;
            turnos++;

            System.out.println();
            mostrar(tabla);

            if (!ganadorX(tabla, X) && turnos < 9) {
                System.out.println("\nTurno Jugador 2");
                do {
                    System.out.print("En que fila introduces la O: ");
                    filaO = sc.nextInt();
                    System.out.print("En que columna introduces la O: ");
                    columnaO = sc.nextInt();

                } while (filaO > 3 || columnaO > 3 || columnaO < 1 || filaO < 1);
                tabla[filaO - 1][columnaO - 1] = O;
                turnos++;
            }
        }
        boolean ganador2 = ganadorO(tabla, O), ganador1 = ganadorX(tabla, X);
        resultado(tabla, ganador1, ganador2);
    }
}