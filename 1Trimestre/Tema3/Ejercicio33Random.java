import java.util.Scanner;

public class Ejercicio33Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, ale;
        ale = (int) (Math.random() * (100 - 1) + 1);

        System.out.println("Introduce un -1 si quieres rendirte");
        
        System.out.print("Prueba un numero entre 100 y 1: ");
        num = sc.nextInt();

        while (num != -1 && num != ale) {
            if (num > ale) {
                System.out.println("Menor");
            } else
                System.out.println("Mayor");

            System.out.print("Prueba un numero entre 100 y 1: ");
            num = sc.nextInt();
        }
        if (num == ale) {
            System.out.println("Has acertado");
        } else {
            System.out.println("Mala suerte");
        }
    }
}
