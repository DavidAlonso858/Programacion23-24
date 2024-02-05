package examentema5parte2;

import java.util.Scanner;

public class ExamenTema5Parte2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] juegoBelen = new int[5][];
        int numColumnas, numAleatorio, columnaIntro = 1, conteoNumeros = 0;

        numColumnas = numColumnas(sc);
        for (int i = 0; i < juegoBelen.length; i++) {
            juegoBelen[i] = new int[numColumnas];
        }

        mostrar(juegoBelen, numColumnas);
        while (!finJuego(juegoBelen, columnaIntro - 1, conteoNumeros, numColumnas)) {
            numAleatorio = numAleatorio(); // lo llama solo cuando haya pasao del do-while

            do {
                System.out.println("Debe colocar el numero " + numAleatorio);
                System.out.print("Introduzca la columna (1 - " + numColumnas + ") donde quiere introducir el numero " + numAleatorio + ": ");
                columnaIntro = sc.nextInt();
            } while (columnaIntro < 1 || columnaIntro > juegoBelen[0].length || avisoError(juegoBelen, columnaIntro - 1));

            if (insertarNumero(juegoBelen, columnaIntro - 1, numAleatorio)) {
                mostrar(juegoBelen, numColumnas); // muestra si se ha insertado
                conteoNumeros++;
            }
        }
        System.out.println("FIN. Espero que haya salido bien");
    }

    public static int numColumnas(Scanner sc) {
        int numColumnas;
        do {
            System.out.print("Introduzca el numero de columnas(4/6): ");
            numColumnas = sc.nextInt();
        } while (numColumnas != 4 && numColumnas != 6);

        return numColumnas;
    }

    public static int numAleatorio() {
        int numero;

        numero = (int) (Math.random() * (10 - 1) + 1); // del 9 al 1

        return numero;
    }

    public static boolean insertarNumero(int[][] juegoBelen, int columna, int numAleatorio) {
        boolean insertado = false;
        for (int fila = 0; fila < juegoBelen.length && !insertado; fila++) {
            if (juegoBelen[fila][columna] == 0) {
                juegoBelen[fila][columna] = numAleatorio;
                insertado = true;
            }
        }
        return insertado;
    }

    public static boolean avisoError(int[][] juegoBelen, int columIntro) {
        boolean error = false;
        int ultimaFila = juegoBelen.length - 1;

        if (juegoBelen[ultimaFila][columIntro] != 0) { //ultimo ocupado
            error = true;
            System.out.println("\n''ERROR. La columna esta llena. Introduzca otra para ese numero''");
        }
        return error;
    }

    public static boolean finJuego(int[][] juegoBelen, int columnaIntro, int conteoNumeros, int numColumnas) {
        boolean acabado = false, ganador=false;
        int ultimaFila = juegoBelen.length - 1;

        for (int fila = 0; fila < juegoBelen.length && !acabado; fila++) {
            if (columnaIntro > 0 && columnaIntro < juegoBelen[0].length - 1) { // huecos intermedios
                if (juegoBelen[fila][columnaIntro + 1] != 0 && juegoBelen[fila][columnaIntro] > juegoBelen[fila][columnaIntro + 1]) { // columna mayor
                    acabado = true;
                    System.out.println("FINAL DEL JUEGO.4");
                    conteoNumeros--;
                    System.out.println("Ha colocado " + conteoNumeros + " numeros de " + (numColumnas * juegoBelen.length));
                }
                if (juegoBelen[fila][columnaIntro - 1] != 0 && juegoBelen[fila][columnaIntro] < juegoBelen[fila][columnaIntro - 1]) { //columan menor
                    acabado = true;
                    System.out.println("FINAL DEL JUEGO.3");
                    conteoNumeros--;
                    System.out.println("Ha colocado " + conteoNumeros + " numeros de " + (numColumnas * juegoBelen.length));
                }
            }
            if (columnaIntro == 0) { // primera columna
                if (juegoBelen[fila][columnaIntro + 1] != 0 && juegoBelen[fila][columnaIntro] > juegoBelen[fila][columnaIntro + 1]) { 
                    acabado = true;
                    System.out.println("FINAL DEL JUEGO.2");
                    conteoNumeros--;
                    System.out.println("Ha colocado " + conteoNumeros + " numeros de " + (numColumnas * juegoBelen.length));
                }
            }
            if (columnaIntro == juegoBelen[0].length - 1) { // ultima columna
                if (juegoBelen[fila][columnaIntro - 1] != 0 && juegoBelen[fila][columnaIntro] < juegoBelen[fila][columnaIntro - 1]) {
                    acabado = true;
                    System.out.println("FINAL DEL JUEGO.1");
                    conteoNumeros--;
                    System.out.println("Ha colocado " + conteoNumeros + " numeros de " + (numColumnas * juegoBelen.length));
                }
            }
        }

        for (int columna = 0; columna < juegoBelen[0].length && acabado; columna++) {
            if (juegoBelen[ultimaFila][columna] == 0) {
                acabado = true;
                ganador=true; 
            }
        }
        if (acabado && !ganador) {
            System.out.println("ENHORABUENA. HA COLOCADO TODOS LOS NUMEROS");
        }
        return acabado;
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
        for (int columnas = 0; columnas < juegoBelen[0].length; columnas++) {
            System.out.print("|C" + (columnas + 1) + "\t");
        }
        System.out.println("");
    }
}
