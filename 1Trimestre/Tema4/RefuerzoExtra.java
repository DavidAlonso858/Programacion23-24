import java.util.Scanner;

public class RefuerzoExtra {

    public static int longitud(int numero) {
        int longitud = 1;
        while (numero > 9) {
            numero /= 10;
            longitud++;
        }
        return longitud;
    }

    public static int narcicista(int numero) {
        int longitud = longitud(numero);
        int cifra, resultado = 0;

        for (int contador = 0; contador < longitud; contador++) {
            cifra = numero % 10;
            resultado += (int) Math.pow(cifra, longitud);
            numero /= 10;
        }

        return resultado;
    }

    public static void esNarcisista(int numero) {
        int numEncontrado = 0;
        int contador = 1;

        while (numEncontrado < numero) {
            if (narcicista(contador) == contador) {
                numEncontrado++;
                System.out.println(contador);
            }
            contador++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 20;

        esNarcisista(numero);
    }
}
