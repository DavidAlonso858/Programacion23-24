import java.util.Scanner;

public class DiseñoBucles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduzca un numero positivo o multiplo de 5: ");
            numero = sc.nextInt();
        } while (numero > 0 || numero % 5 == 0);
    }
}
