import java.util.Scanner;

public class Refuerzo20TrianguloHueco {
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

        for (int altura = 1; altura < numFilas; altura++) {
            for (int blanco = altura; blanco < numFilas; blanco++) {
                System.out.print(" ");
            }
            for (int pintar = 1; pintar <= altura * 2; pintar++) {
                if (pintar == 1 || pintar == altura * 2 - 1) {
                    System.out.print(caracter + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int base = 0; base < numFilas+1; base++) {
            System.out.print(caracter + " ");
        }

    }
}
