import java.util.Scanner;

public class EjercicioIfElsePar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un numerin: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Su numero es par");
        } else {
            System.out.println("Su numero es impar");
        }
    }
}
