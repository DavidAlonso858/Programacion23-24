import java.util.Scanner;

public class Refuerzo10 {

    public static boolean ganador(char[][] tabla, char turno) {
        boolean ganador = false;

        ganador = ((tabla[0][0] == turno) && (tabla[0][1] == turno) && (tabla[0][2] == turno) // fila1
                ||
                (tabla[1][0] == turno) && (tabla[1][1] == turno) && (tabla[1][2] == turno) // fila2
                ||
                (tabla[2][0] == turno) && (tabla[2][1] == turno) && (tabla[2][2] == turno) // fila3
                ||
                (tabla[0][0] == turno) && (tabla[1][0] == turno) && (tabla[2][0] == turno) // columna1
                ||
                (tabla[0][1] == turno) && (tabla[1][1] == turno) && (tabla[2][1] == turno) // columna2
                ||
                (tabla[0][2] == turno) && (tabla[1][2] == turno) && (tabla[2][2] == turno) // columna3
                ||
                (tabla[0][0] == turno) && (tabla[1][1] == turno) && (tabla[2][2] == turno) // diagonal1
                ||
                (tabla[0][2] == turno) && (tabla[1][1] == turno) && (tabla[2][0] == turno)); // diagonal2

        return ganador;
    }

    public static void resultado(char[][] tabla, boolean ganador, char turno) {
        if (ganador && turno == 'X') {
            System.out.println("\nEnhorabuena, ha ganado el Jugador 1 con sus increible jugada con las X");
        } else if (ganador && turno == 'O') {
            System.out.println("\nEnhorabuena, ha ganado el Jugador 2 con sus increible jugada con los O");
        } else
            System.out.println("\nEmpate en este reñido duelo de titanes");
    }

    public static void mostrar(char[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "|\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char turno = 'X';
        char[][] tabla = new char[3][3];
        int filaX, columnaX, filaO, columnaO, turnos = 0;

        while (!ganador(tabla, turno) && turnos != 9) {
            System.out.println();
            mostrar(tabla);
            System.out.println();

            System.out.println("Turno Jugador 1");
            do {
                System.out.print("En que fila introduces la X: ");
                filaX = sc.nextInt();
                System.out.print("En que columna introduces la X: ");
                columnaX = sc.nextInt();

            } while (filaX > tabla.length || columnaX > tabla[0].length || columnaX < 1 || filaX < 1);
            turno = 'X';
            tabla[filaX - 1][columnaX - 1] = turno;
            turnos++;

            System.out.println();
            mostrar(tabla);

            if (!ganador(tabla, turno) && turnos < 9) {
                System.out.println("\nTurno Jugador 2");
                do {
                    System.out.print("En que fila introduces la O: ");
                    filaO = sc.nextInt();
                    System.out.print("En que columna introduces la O: ");
                    columnaO = sc.nextInt();

                } while (filaO > 3 || columnaO > 3 || columnaO < 1 || filaO < 1);
                turno = 'O';
                tabla[filaO - 1][columnaO - 1] = turno;
                turnos++;
            }
        }
        boolean ganador = ganador(tabla, turno);
        resultado(tabla, ganador, turno);
    }
}