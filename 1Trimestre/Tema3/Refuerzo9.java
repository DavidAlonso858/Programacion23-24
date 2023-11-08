import java.util.Scanner;

public class Refuerzo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, digitos = 0, cifra = 0;

        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();

        while (num != 0) {
            cifra = num % 10;
            System.out.print(cifra + ", ");
            num = num / 10;
            digitos++;
        }
        System.out.println("\nEl numero tiene: " + digitos + " digitos");
    }
}
