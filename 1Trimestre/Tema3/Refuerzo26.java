import java.util.Scanner;

public class Refuerzo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, digito, posicion = 0, digito2 = 0;

        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();

        System.out.print("Introduzca un digito de ese numero: ");
        digito = sc.nextInt();

        while (numero != 0) {
            digito2 = numero % 10;
            posicion++;
            numero /= 10;
            if (digito2 == digito) {
                System.out.println("La posicion de ese digito es: " + posicion);
            }
        }
    }
}
