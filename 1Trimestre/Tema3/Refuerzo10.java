import java.util.Scanner;

public class Refuerzo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, todos = 0, media = 0, veces = 0;

        System.out.println("Introduce un numero negativo si quieres parar");

        do {
            System.out.print("Introduzca un numero: ");
            num = sc.nextInt();
            if (num >= 0) {
                veces++;
                todos += num;
            }
        } while (num >= 0);
        media = todos / veces;
        System.out.println("La media es: " + media);
    }
}
