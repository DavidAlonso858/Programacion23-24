import java.util.Scanner;

public class RepasoExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, digito, sumDig = 0;

        do {
            System.out.print("Introduzca un numero entero positivo: ");
            numero = sc.nextInt();
        } while (numero < 0);

        int aux = numero;
        while (aux > 0) {
            digito = aux % 10;
            sumDig += digito;
            aux /= 10;
            if (aux == 0 && sumDig >= 10) {
                aux = sumDig;
                sumDig = 0;
            }
        }
        System.out.println("Su crapulo es: "+sumDig);
    }
}
