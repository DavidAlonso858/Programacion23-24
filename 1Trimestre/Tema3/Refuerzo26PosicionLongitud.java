import java.util.Scanner;

public class Refuerzo26PosicionLongitud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, aux = 0, digito, posicion = 0, digito2 = 0;

        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();

        System.out.print("Introduzca un digito de ese numero: ");
        digito = sc.nextInt();

        if (numero == 0) {
            System.out.println("La posicion es 1");
        }

        aux = numero;

        while (aux != 0) {// longitud
            aux /= 10;
            posicion++;
        }

        aux = numero;

        while (aux != 0) {// coincidencia digitoss
            digito2 = aux % 10;
            if (digito2 == digito) {
                System.out.println("La posicion de ese digito es: " + posicion);
            }
            aux /= 10;
            posicion--;
        }
    }
}
