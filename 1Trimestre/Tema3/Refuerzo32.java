import java.util.Scanner;

public class Refuerzo32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numero, suma = 0, digito;

        do {
            System.out.print("Por favor, introduzca un numero entero positivo: ");
            numero = sc.nextInt();
        } while (numero < 0);

        System.out.print("Digitos pares: ");

        while (numero > 0) {
            digito = numero % 10;
            if (digito % 2 == 0) {
                System.out.print(digito + " ");
                suma += digito;
            }
            numero /= 10;
        }
        System.out.println("\nSuma de los digitos pares: " + suma);

    }
}
