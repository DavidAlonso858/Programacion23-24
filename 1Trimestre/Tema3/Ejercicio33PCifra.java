import java.util.Scanner;

public class Ejercicio33PCifra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numP, cifra;

        do {
            System.out.print("Introduzca un numerin positivo: ");
            numP = sc.nextInt();
        } while (numP < 0);

        if (numP == 0) {
            System.out.println("0");
        } else {
            while (numP > 0) {
                cifra = numP % 10;
                System.out.print(cifra + " , ");
                numP = numP / 10;
            }
        }
    }
}
