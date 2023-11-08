import java.util.Scanner;

public class Refuerzo25CifraInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, cifra = 0, inverso = 0;

        do {
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();
        } while (numero < 0);

        if (numero >= 0 && numero < 10) {
            System.out.println("El inverso es el mismo numero");
        } else {
            System.out.println("El inverso es: ");
            while (numero > 0) {
                cifra = numero % 10;
                System.out.print(cifra);
                numero = numero / 10;

            }
        }
    }
}
