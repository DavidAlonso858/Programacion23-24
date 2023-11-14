import java.util.Scanner;

public class Refuerzo49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, cuentaNumeros = 0, suma = 0, minimo = Integer.MAX_VALUE, maximo = Integer.MIN_VALUE;
        boolean primo;

        do {
            System.out.print("Por favor introduzca un numero entero positivo. Para terminar, introduzca un  primo: ");
            numero = sc.nextInt();

            primo = true;

            for (int rangoPrimo = 2; rangoPrimo < numero && primo; rangoPrimo++) {
                if (numero % rangoPrimo == 0) {
                    primo = false;
                }
            }

            if (!primo) {
                cuentaNumeros++;
                suma += numero;
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            }

        } while (!primo);

        System.out.println("Has introducido " + cuentaNumeros + " numeros no primos");
        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);
        System.out.println("Media: " + (suma / cuentaNumeros));
    }
}
