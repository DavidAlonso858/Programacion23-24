import java.util.Scanner;

public class RefuerzoExtra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFilas, base = 2;

        do {
            System.out.print("Introduce un número entero positivo entre 1 y 10: ");
            numFilas = sc.nextInt();
        } while (numFilas < 1 || numFilas >= 11);

        for (int altura = 0; altura < numFilas; altura++) {
            for (int blanco = altura; blanco < numFilas; blanco++) {
                System.out.print(" ");
            }
            int aux = base;
            for (int contador = 0; contador <= altura; contador++) {
                aux++;
            }
            for (int contador = 0; contador <= altura; contador++) {

                System.out.print(aux-- % 10);
            }

            int aux2 = base + 2;

            for (int i = 1; i <= altura; i++) {
                System.out.print(aux2++ % 10);

            }
            System.out.println();

        }
    }

}