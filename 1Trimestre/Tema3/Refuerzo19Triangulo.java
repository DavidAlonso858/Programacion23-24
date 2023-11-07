import java.util.Scanner;

public class Refuerzo19Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFilas;
        char caracter;
        do {
            System.out.print("Introduzca el numero de filas: ");
            numFilas = sc.nextInt();

            System.out.print("Introduzca el caracter para pintar: ");
            caracter = sc.next().charAt(0);
        } while (numFilas <= 0);

        for (int altura = 1; altura <= numFilas; altura++) {
            for (int blanco = 1; blanco <= numFilas - altura; blanco++) {
                System.out.print(" ");
            }
            for (int pintar = 1; pintar <= altura; pintar++) {
                System.out.print(caracter+ " ");
            }
            System.out.println();
        }
    }
}
