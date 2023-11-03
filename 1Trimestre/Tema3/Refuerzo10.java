import java.util.Scanner;

public class Refuerzo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, media = 0, veces = 0;
        System.out.println("Introduce un numero negativo cuando no quieras introducir mas");
        do {
            System.out.print("Introduzca un numero: ");
            num = sc.nextInt();
            veces++;
            num+=num;
            media = num / veces;
        } while (num > 0);
        System.out.println("La media es: " + media);
    }
}
