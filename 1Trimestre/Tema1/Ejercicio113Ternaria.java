import java.util.Scanner;

public class Ejercicio113Ternaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entero, multiplo, resto, suma;

        System.out.println("Introduza un numero entero: ");
        entero = sc.nextInt();

        System.out.println("Introduzca el numero que va a ser multiplo: ");
        multiplo = sc.nextInt();

        resto = entero % multiplo;
        suma = multiplo - resto;

        suma = suma == multiplo ? 0 : suma;

        System.out.println("Hay que sumarle: " + suma);
    }
}
