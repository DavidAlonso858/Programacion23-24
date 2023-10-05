import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerin;

        System.out.println("Introduzca un numero: ");
        numerin = sc.nextInt();

        if (numerin > 99999 || numerin < 0) {
            System.out.println("Vuelve a introducir un numero: ");
            numerin = sc.nextInt();
        } else if (numerin >= 0 && numerin < 10) {
            System.out.println("El numero tiene 1 cifra");
        } else if (numerin >= 10 && numerin < 100) {
            System.out.println("El numero tiene 2 cifra");
        } else if (numerin >= 100 && numerin < 1000) {
            System.out.println("El numero tiene 3 cifra");
        } else if (numerin >= 1000 && numerin < 10000) {
            System.out.println("El numero tiene 4 cifra");
        } else if (numerin >= 10000 && numerin <= 99999) {
            System.out.println("El numero tiene 5 cifra");
        }
    }
}
