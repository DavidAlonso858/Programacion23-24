import java.util.Scanner;

public class Ejercicio33P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numP, cifra, cifra1, cifra2;

        do {
            System.out.print("Introduzca un numerin positivo: ");
            numP = sc.nextInt();
        } while (!(numP >= 0));

        cifra = numP / 100;
        cifra1 = (numP / 10) % 10;
        cifra2 = numP % 10;
        System.out.println(numP + " -> " + cifra2 + " , " + cifra1 + " , " + cifra);
    }
}
