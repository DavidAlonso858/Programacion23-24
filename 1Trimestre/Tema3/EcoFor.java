import java.util.Scanner;

public class EcoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca el numero de veces: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Eco...");
        }

    }
}
