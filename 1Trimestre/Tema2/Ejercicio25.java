import java.util.Scanner;

/*
 * Orden decreciento de dos numeros con if-else
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, mayor, menor;
        String iguales;

        System.out.println("Inserte un numerin: ");
        num1 = sc.nextInt();

        System.out.println("Inserte otro numerin: ");
        num2 = sc.nextInt();

        mayor = (num1 > num2) ? num1 : num2;
        menor = !(num1 > num2) ? num1 : num2;
        iguales = (num1 == num2) ? ("Los numeros son iguales: " + num1 + " y " + num2)
                : ("El numero " + mayor + " es mayor que " + menor);

        System.out.println(iguales);
    }
}
