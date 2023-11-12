import java.util.Scanner;

public class Refuerzo48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numero, aux, longitud = 0, digitoAp;
        boolean aparecen;
        do {
            System.out.print("Introduzca un numero entero: ");
            numero = sc.nextLong();
        } while (numero < 0);

        System.out.print("Digitos que aparecen en el numero: ");
        for (digitoAp = 0; digitoAp < 10; digitoAp++) {
            aparecen = false;
            aux = numero;
            while (aux > 0) {
                if (aux % 10 == digitoAp) {
                    aparecen = true;
                }
                aux /= 10;
            }
            if (aparecen) {
                System.out.print(digitoAp + " ");
            }
        }
        System.out.print("\nDigitos que no aparecen en el numero: ");
        for (digitoAp = 0; digitoAp < 10; digitoAp++) {
            aparecen = false;
            aux = numero;
            while (aux > 0) {
                if (aux % 10 == digitoAp) {
                    aparecen = true;
                }
                aux /= 10;
            }
            if (!aparecen) {
                System.out.print(digitoAp + " ");
            }
        }
    }
}
