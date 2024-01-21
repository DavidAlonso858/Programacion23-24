import java.util.Scanner;

public class Refuerzo8 {
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * char[][] tabla = new char[8][8];
     * rellenarMatriz(tabla);
     * mostrar(tabla);
     * 
     * do {
     * 
     * } while ();
     * System.out.println("\n\nEl alfil puede moverse a las siguiente posiciones: "
     * );
     * }
     * 
     * public static void rellenarMatriz(char[][] tabla) {
     * char[] letra = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
     * 
     * for (int i = 0; i < tabla.length; i++) {
     * for (int j = 0; j < tabla[i].length; j++) {
     * tabla[i][j] = letra[j];
     * }
     * }
     * }
     * 
     * public static void mostrar(char[][] tabla) {
     * for (int i = 0; i < tabla.length; i++) {
     * System.out.print("\t  ");
     * for (int j = 0; j < tabla.length; j++) {
     * System.out.print(tabla[i][j] + "\t");
     * }
     * System.out.println("Fila " + (i + 1));
     * }
     * System.out.print("Columnas: ");
     * for (int i = 0; i < tabla[0].length; i++) {
     * System.out.print(tabla[0][i] + "\t");
     * }
     * }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String posicionAlfil;

        System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
        posicionAlfil = sc.nextLine(); // String para luego sacar cada parte por separado

        int columnaAlfil = (int) (posicionAlfil.charAt(0)) - 96; // extrae el primer valor y 96 por los valores ASCII
        int filaAlfil = (int) (posicionAlfil.charAt(1)) - 48;

        System.out.println("El alfil puede moverse a las siguientes posiciones:");
        for (int fila = 8; fila >= 1; fila--) {
            for (int columna = 1; columna <= 8; columna++) {
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                        && (!((filaAlfil == fila) && (columnaAlfil == columna)))) { // Asegura que se mueve en diagonal
                    System.out.print((char) (columna + 96) + "" + fila + " ");
                }
            }
        }
    }
}
