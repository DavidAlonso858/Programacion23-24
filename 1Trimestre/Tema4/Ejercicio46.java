import java.util.Scanner;

public class Ejercicio46 {
    public static boolean esPrimo(int n) {
        boolean primo = true;
        for (int contadorPrimo = 2; contadorPrimo < n && primo; contadorPrimo++) {
            if (n % contadorPrimo == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {

            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();
        } while (numero < 0);

        System.out.println("Es primo: " + esPrimo(numero));
    }

}
