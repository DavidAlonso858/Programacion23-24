import java.util.Scanner;

public class Refuerzo45Posicion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long aux, digito, longitud = 0, numero, posicion, resultado = 0, contador = 0;

        do {
            System.out.print("Por favor, introduzca un numero entero positivo: ");
            numero = sc.nextLong();

            System.out.print("Introduzca la posicion dentro del numero: ");
            posicion = sc.nextLong();

            System.out.print("Intorduzca el nuevo digito: ");
            digito = sc.nextLong();

        } while (numero < 0 || digito < 0 || posicion <= 0);

        aux = numero;
        while (aux > 0) {
            aux /= 10;
            longitud++;
        }
        while (numero > 0) {

            long digito2 = numero % 10;
            if (longitud == posicion) {

                digito2 = digito;
            }
            resultado += (digito2 * Math.pow(10, contador++));
            numero /= 10;
            longitud--;
        }
        System.out.println("El numero resultante es " + resultado);
    }
}