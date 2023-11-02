import java.util.Scanner;

public class Ejercicio314A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, primos = 0;
        boolean primo;

        do {
            System.out.print("Introduzca un numero: ");
            n = sc.nextInt();
        } while (n < 0);

        for (int cont = 1; cont <= n; cont++) {
            primo = true;
            for (int cont2 = 2; cont2 <= cont - 1 && primo; cont2++) {// -1 porque todos los primos son divisibles por
                                                                      // si mismo
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
