import java.util.Scanner;

public class DiseñoBucles1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduzca un numero positivo y multiplo de 5: ");
            numero = sc.nextInt();
        } while (numero > 0 && numero % 5 == 0);
    }
}
