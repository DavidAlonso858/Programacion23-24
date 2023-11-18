import java.util.Scanner;

public class Ejercicio47 {
    public static boolean esPrimo(int n) {
        boolean primo = true;
        for (int contadorPrimo = 2; contadorPrimo < n && primo; contadorPrimo++) {
            if (n % contadorPrimo == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static int divPrimos(int n) {
        int contDivPrimos = 0;

        for (int cont = 1; cont < n; cont++) {
            if (esPrimo(cont) && n % cont == 0) {
                contDivPrimos++;
                System.out.print(cont + ", ");
            }
        }
        return contDivPrimos;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        int divisores = divPrimos(numero);
        System.out.println("\nEl total de divisores primos de el numero " + numero + " es " + divisores);
    }

}
