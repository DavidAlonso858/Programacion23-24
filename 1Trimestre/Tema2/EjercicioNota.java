import java.util.Scanner;

public class EjercicioNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1;

        System.out.println("Introduzca una nota:");
        nota1 = sc.nextInt();

        if (nota1 < 5 && nota1 >= 0) {
            System.out.println("Insuficiente");
        } else if (nota1 == 5) {
            System.out.println("Suficiente");
        } else if (nota1 == 6) {
            System.out.println("Bien");
        } else if (nota1 > 6 && nota1 < 9) {
            System.out.println("Notable");
        } else if (nota1 >= 9 && nota1 <= 10) {
            System.out.println("Sobresaliente");
        } else if (nota1 < 0) {
            System.out.println("Dedicate a otra cosa");
        } else if (nota1 > 10) {
            System.out.println("Te vamos a pasar de curso");
        }
    }
}
