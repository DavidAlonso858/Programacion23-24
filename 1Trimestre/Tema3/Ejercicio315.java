import java.util.Scanner;

public class Ejercicio315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca el numero de medida: ");
        num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
