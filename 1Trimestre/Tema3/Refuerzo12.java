import java.util.Scanner;

public class Refuerzo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, terFibonacci = 0, fibo1 = 0, fibo2 = 1;

        do {
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();
        } while (numero < 0);

        for (int conteo = 0; conteo <= numero; conteo++) {
            System.out.println(terFibonacci);
            terFibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = terFibonacci;
        }
    }
}
