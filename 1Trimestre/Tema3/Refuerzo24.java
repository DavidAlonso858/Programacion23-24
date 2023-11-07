import java.util.Scanner;

public class Refuerzo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFilas;

        do {
            System.out.print("Introduzca el numero de filas: ");
            numFilas = sc.nextInt();
        } while (numFilas < 0);

        for (int altura = 1; altura <= numFilas; altura++) {
            for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
                System.out.print(" ");
            }
            for (int numeros = 1; numeros <= altura; numeros++) {
                System.out.print(numeros);
            }

            for (int numeros = altura - 1; numeros > 0; numeros--) {
                System.out.print(numeros);
            }
            System.out.println();
        }

    }
}
