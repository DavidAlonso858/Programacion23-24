import java.util.Scanner;

public class Ejercicio315A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, elementos = 0, nFac = 1;

        do {
            System.out.print("Introduzca la n: ");
            n = sc.nextInt();
        } while (n <= 0);
        for (int i = n; i < 1; i--) {
            nFac = nFac * i;
        }
          for (int i = 0; i < n; i++) {

            int uno = 1;
            
            for (int j = 0; j <= i; j++) {

                System.out.print(uno+" ");
                uno *= (i - j) / (j + 1);

            }

            System.out.println(" ");
        }
    }
}
