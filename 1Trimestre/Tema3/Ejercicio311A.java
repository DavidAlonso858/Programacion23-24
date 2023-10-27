import java.util.Scanner;

public class Ejercicio311A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, digito;
        String binario = "";

        do {
            System.out.print("Introduce un numero para pasarlo a binario: ");
            numero = sc.nextInt();
        } while (numero < 0);

        for (; numero > 0; numero /= 2) {
            digito = numero % 2;
            binario = digito + binario;

        }
        System.out.println("El binario es: " + binario);
    }
}
