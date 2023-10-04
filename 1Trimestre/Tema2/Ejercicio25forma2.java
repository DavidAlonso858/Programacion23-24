import java.util.Scanner;

/*
 * Orden decreciento de dos numeros con if-else
 */
public class Ejercicio25forma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, mayor = 0, menor = 0;

        System.out.println("Inserte un numerin: ");
        num1 = sc.nextInt();

        System.out.println("Inserte otro numerin: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            mayor = num1;
            menor = num2;
            System.out.println("El numero " + mayor + " es mayor que el numero " + menor);
        } else if (num2 > num1) {
            mayor = num2;
            menor = num1;
            System.out.println("El numero " + mayor + " es mayor que el numero " + menor);
        } else if (num1 == num2) {
            System.out.println("Los numeros son iguales: " + num1 + " y " + num2);

        }
    }
}
