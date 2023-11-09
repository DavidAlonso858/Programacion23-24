import java.util.Scanner;

public class Refuerzo34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num, num2, digito = 0, digito2, aux, longitud = 0;
        String cadenaPar = "";
        String cadenaImpar = "";

        do {
            System.out.print("Por favor, introduzca un numero: ");
            num = sc.nextLong();

            System.out.print("Introduzca otro numero: ");
            num2 = sc.nextLong();
        } while (num < 0 || num2 < 0);

        aux = num;

        while (aux > 0) {
            aux /= 10;
            longitud++;
        }

        for (int i = 0; i < longitud; i++) {

            digito = num % 10;
            digito2 = num2 % 10;

            if (digito % 2 == 0) {
                cadenaPar = digito + " " + cadenaPar;

            } else {
                cadenaImpar = digito + " " + cadenaImpar;
            }

            if (digito2 % 2 == 0) {
                cadenaPar = digito2 + " " + cadenaPar;

            } else {
                cadenaImpar = digito2 + " " + cadenaImpar;
            }

            num /= 10;
            num2 /= 10;
        }

        System.out.println("El numero formado por los digitos pares es: " + cadenaPar);
        System.out.println("El numero formado por los digitos impares es: " + cadenaImpar);
    }
}
