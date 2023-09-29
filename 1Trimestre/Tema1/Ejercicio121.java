import java.util.Scanner;

public class Ejercicio121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        boolean iguales;

        System.out.println("Introduzca el primer numero: ");
        a = sc.nextInt();

        System.out.println("Introduzca el segundo numero: ");
        b = sc.nextInt();

        iguales = a == b;

        System.out.println("Son ambos numeros iguales: " + iguales);
    }
}
