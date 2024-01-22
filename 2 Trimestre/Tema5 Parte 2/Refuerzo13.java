public class Refuerzo13 {

    public static int aleatorio() {
        int numero;

        numero = (int) (Math.random() * (210 - 140) + 140);

        return numero;
    }

    public static void rellenarMatriz(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = aleatorio();
            }
        }
    }

    public static int media(int[][] tabla, int numero) {
        int suma = 0, media;
        for (int j = 0; j < tabla[numero].length; j++) {
            suma += tabla[numero][j];
        }
        media = suma / tabla[numero].length;

        return media;
    }

    public static int minimo(int[][] tabla, int numero) {
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < tabla[numero].length; j++) {
            if (tabla[numero][j] < min) {
                min = tabla[numero][j];
            }
        }

        return min;
    }

    public static int maximo(int[][] tabla, int numero) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < tabla[numero].length; j++) {
            if (tabla[numero][j] > max) {
                max = tabla[numero][j];
            }
        }

        return max;
    }

    public static void mostrar(String[] pais, int[][] tabla) {
        System.out.print("\t\t\t\t\t\t MED");
        System.out.print(" MIN");
        System.out.print(" MAX");
        System.out.println();

        for (int i = 0; i < pais.length; i++) {
            System.out.print(pais[i] + ":\t"); // variable i en la tabla pais pilla el string del nombre
            for (int k = 0; k < tabla[i].length; k++) { // en la tabla de numeros pilla la fila
                System.out.print(tabla[i][k] + " ");
            }
            System.out.print("|");
            System.out.print(media(tabla, i) + " ");
            System.out.print(minimo(tabla, i) + " ");
            System.out.print(maximo(tabla, i) + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] pais = { "Espana", "Rusia", "Japon", "Austra" };
        int[][] altura = new int[4][10];

        rellenarMatriz(altura);
        mostrar(pais, altura);
    }
}
