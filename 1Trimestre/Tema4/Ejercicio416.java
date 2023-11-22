import java.util.Scanner;

public class Ejercicio416 {

    public static int divisoresPrimos(int numero) {
        int divPrimo = 0;

        System.out.println("Los divisores primos de " + numero + " son:");
        for (int contador = 1; contador <= numero; contador++) {
            if (Ejercicio46.esPrimo(contador) && numero % contador == 0) {
                System.out.println(contador);
                divPrimo++;
            }
        }
        return divPrimo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 30;

        System.out.println("El total de divisores primos es: " + divisoresPrimos(numero));
    }

}
