import java.util.Scanner;

public class Refuerzo7 {

    public static int aleatorio(char[][] tablaTesoro) {
        int numero;

        numero = (int) (Math.random() * (tablaTesoro.length));

        return numero;
    }

    public static void colocarTesoro(char[][] tablaTesoro) {
        int fila = aleatorio(tablaTesoro);
        int columna = aleatorio(tablaTesoro);

        tablaTesoro[fila][columna] = 'T';
    }

    public static void colocarMina(char[][] tablaTesoro) {
        int minas = 0;
        int fila, columna;
        while (minas < 3) {
            fila = aleatorio(tablaTesoro);
            columna = aleatorio(tablaTesoro);

            if (tablaTesoro[fila][columna] != 'T') {
                tablaTesoro[fila][columna] = 'M';
                minas++;
            }
        }
    }

    public static boolean buscarTesoro(char[][] tablaTesoro, int fila, int columna) {
        boolean encontrado = false;
        if (tablaTesoro[fila][columna] == 'T') {
            System.out.println("''Enrohabuena has encontrado el tesoro de 100k''");
            encontrado = true;
        } else if (tablaTesoro[fila][columna] == 'M') {
            System.out.println("''Lo siento, has pisado una mina. Game Over''");
            encontrado = true;
        } else {
            System.out.println("''Puedes continuar sin problema''");
            avisaMina(tablaTesoro, (fila), (columna));
        }
        return encontrado;
    }

    public static void avisaMina(char[][] tablaTesoro, int fila, int columna) {
        switch (fila) {
            case 0:
                switch (columna) {
                    case 0:
                        if (tablaTesoro[fila][columna + 1] == 'M' || tablaTesoro[fila + 1][columna] == 'M') {
                            System.out.println("¡CUIDADO! ¡Hay una mina cerca!");
                        }
                        break;
                    case 1:
                        if (tablaTesoro[fila][columna + 1] == 'M' || tablaTesoro[fila][columna - 1] == 'M'
                                || tablaTesoro[fila + 1][columna] == 'M') {
                            System.out.println("¡CUIDADO! ¡Hay una mina cerca!");
                        }
                        break;
                    case 2:
                        if (tablaTesoro[fila][columna - 1] == 'M' || tablaTesoro[fila + 1][columna] == 'M') {
                            System.out.println("¡CUIDADO! ¡Hay una mina cerca!");
                        }
                        break;
                }

                break;
            case 1:
                switch (columna) {
                    case 0:
                        if (tablaTesoro[fila][columna + 1] == 'M' || tablaTesoro[fila + 1][columna] == 'M'
                                || tablaTesoro[fila - 1][columna] == 'M') {
                            System.out.println("¡CUIDADO! ¡Hay una mina cerca!");
                        }
                        break;
                    case 1:
                        if (tablaTesoro[fila][columna + 1] == 'M' || tablaTesoro[fila][columna - 1] == 'M'
                                || tablaTesoro[fila + 1][columna] == 'M' || tablaTesoro[fila - 1][columna] == 'M') {
                            System.out.println("¡CUIDADO! ¡Hay una mina cerca!");
                        }
                        break;
                    case 2:
                        if (tablaTesoro[fila][columna - 1] == 'M' || tablaTesoro[fila + 1][columna] == 'M'
                                || tablaTesoro[fila - 1][columna] == 'M') {
                            System.out.println("¡CUIDADO! ¡Hay una mina cerca!");
                        }
                        break;
                }

                break;
            case 2:
                switch (columna) {
                    case 0:
                        if (tablaTesoro[fila][columna + 1] == 'M' || tablaTesoro[fila - 1][columna] == 'M') {
                            System.out.println("¡CUIDADO! ¡Hay una mina cerca!");
                        }
                        break;
                    case 1:
                        if (tablaTesoro[fila][columna + 1] == 'M' || tablaTesoro[fila][columna - 1] == 'M'
                                || tablaTesoro[fila - 1][columna] == 'M') {
                            System.out.println("¡CUIDADO! ¡Hay una mina cerca!");
                        }
                        break;
                    case 2:
                        if (tablaTesoro[fila][columna - 1] == 'M' || tablaTesoro[fila - 1][columna] == 'M') {
                            System.out.println("¡CUIDADO! ¡Hay una mina cerca!");
                        }
                        break;
                }
        }

    }

    public static void mostrar(char[][] tablaTesoro) {
        for (int i = 0; i < tablaTesoro.length; i++) {
            System.out.print("\t  ");
            for (int j = 0; j < tablaTesoro[i].length; j++) {
                System.out.print(tablaTesoro[i][j] + "\t");
            }
            System.out.print("Fila: " + (i + 1));
            System.out.println();
        }
        System.out.print("Columnas: ");
        for (int i = 0; i < tablaTesoro[0].length; i++) {
            System.out.print((i + 1) + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tablaTesoro = new char[3][3];
        colocarTesoro(tablaTesoro);
        colocarMina(tablaTesoro);

        mostrar(tablaTesoro);
        int fila, columna;

        do {
            do {
                System.out.println();
                System.out.print("Introduzca la fila(1-3): ");
                fila = sc.nextInt();
                System.out.print("Introduzca la columna(1-3): ");
                columna = sc.nextInt();
            } while (fila < 1 || fila > 3 || columna < 1 || columna > 3);

        } while (!buscarTesoro(tablaTesoro, fila-1, columna-1));
    }
}
