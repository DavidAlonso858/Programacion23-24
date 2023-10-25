import java.util.Scanner;

public class Ejercicio311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, factorial = 1;

        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.println("El facorial de " + num + " es " + factorial);
    }
}
