import java.util.Scanner;

public class Refuerzo33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFilas;

        do {
            System.out.print("Introduzca la altura de la U: ");
            numFilas = sc.nextInt();
        } while (numFilas <= 0);

        for (int pintar = 1; pintar < numFilas; pintar++) {
            System.out.print("* ");
            for (int blanco = 1; blanco < numFilas; blanco++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print(" ");
        for (int base = 1; base < numFilas - 1; base++) {
            System.out.print("* ");
        }
    }
}
