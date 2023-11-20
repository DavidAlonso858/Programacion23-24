import java.util.Scanner;

public class Ejercicio49 {

    public static int maxNumero(int num1, int num2) {
        int maximo;

        maximo = num1 >= num2 ? num1 : num2;

        return maximo;
    }

    public static int tresMaximo(int num1, int num2, int num3) {
        int maximo;
        int maxDos = maxNumero(num1, num2);
        maximo = num3 > maxDos ? num3 : maxDos;
        return maximo;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Introduzca el primero numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduzca el segundo numero: ");
        num2 = sc.nextInt();

        System.out.print("Introduzca el tercero numero: ");
        num3 = sc.nextInt();

        int maximo = tresMaximo(num1, num2, num3);

        System.out.println("El maximo de los tres es: " + maximo);
    }
}
