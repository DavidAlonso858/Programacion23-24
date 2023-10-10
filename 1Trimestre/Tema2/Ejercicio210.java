import java.util.Scanner;

public class Ejercicio210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1;

        System.out.println("Introduzca una nota:");
        nota1 = sc.nextInt();
        if (nota1 > 10 || nota1 < 0) {
            System.out.println("Te has confundido, introduzca una nota:");
            nota1 = sc.nextInt();
        }
        switch (nota1) {
            case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente");
            case 5 -> System.out.println("Suficiente");
            case 6 -> System.out.println("Bien");
            case 7, 8 -> System.out.println("Notable");
            case 9, 10 -> System.out.println("Sobresaliente");
        }
    }
}