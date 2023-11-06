import java.util.Scanner;

public class Refuerzo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, mayor, menor;

        do {
            System.out.print("Introduzca un numero: ");
            num1 = sc.nextInt();

            System.out.print("Introduzca otro numero: ");
            num2 = sc.nextInt();
        } while (num1 == num2);

        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }
        for (int conteo = menor; menor <= mayor; menor += 7) {
            System.out.println(menor);
        }
    }
}
