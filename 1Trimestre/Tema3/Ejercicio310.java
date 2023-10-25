import java.util.Scanner;

public class Ejercicio310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca un numero: ");
            num = sc.nextInt();
            if (num % 2 != 0) {
                suma += num;
            }
        }
        System.out.println("La suma de los impares es: "+suma);
    }
}
