import java.util.Scanner;

/*
 * Decir si un numero es casi cero o no sinincluir el 0, 1 y -1
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numDec;

        System.out.println("Inserte un numero con decimal: ");
        numDec = sc.nextDouble();

        if (numDec < 1 && numDec > -1 && numDec != 0) {
            System.out.println("El numero: " + numDec + " es un numero casi-cero");
        } else {
            System.out.println("El numero: " + numDec + " no es un numero casi-cero");
        }
    }
}
