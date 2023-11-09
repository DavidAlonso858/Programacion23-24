import java.util.Scanner;

public class Refuerzo34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num, num2, digito = 0, digito2 = 0, par1 = 0, par2 = 0;
        String cadenaPar = "";
        String cadenaImpar = "";
        
        do {
            System.out.print("Por favor, introduzca un numero: ");
            num = sc.nextLong();

            System.out.print("Introduzca otro numero: ");
            num2 = sc.nextLong();
        } while (num < 0 || num2 < 0);

        while (num > 0) {
            digito = num % 10;
            if (digito % 2 == 0) {
                cadenaPar = digito + " " + cadenaPar;

            } else {
                cadenaImpar = digito + " " + cadenaImpar;
            }
            num /= 10;

        }
        while (num2 > 0) {
            digito2 = num2 % 10;
            if (digito2 % 2 == 0) {
                cadenaPar = digito2 + " " + cadenaPar;

            } else {
                cadenaImpar = digito2 + " " + cadenaImpar;
            }
            num2 /= 10;
        }

        System.out.println("El numero formado por los digitos pares es: "+cadenaPar);
        System.out.println("El numero formado por los digitos impares es: "+cadenaImpar);
    }
}
