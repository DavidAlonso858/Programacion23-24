import java.util.Scanner;

public class Ejercicio314A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num2 = 1, primos = 1;
        boolean primo;

        do {
            System.out.print("Introduzca un numero: ");
            n = sc.nextInt();
        } while (n < 0);

        for (int cont = 1; cont <= n; cont += 2) {
            primo = true;
            for (int cont2 = 3; cont2 < cont; cont2 += 2) {
                if (cont % cont2 == 0) {
                    primo = false;

                }
            }
            if (primo == true) {
                primos++;
            }

        }
        System.out.println("Resultan un total de " + primos + " numeros primos");
    }
}
