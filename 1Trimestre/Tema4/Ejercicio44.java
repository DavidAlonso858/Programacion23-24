import java.util.Scanner;

public class Ejercicio44 {

    public static int maxNumero(int num1, int num2) {
        int maximo;

        maximo = num1 >= num2 ? num1 : num2;

        return maximo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Introduzca un numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduzca otro numero: ");
        num2 = sc.nextInt();

        System.out.println("El maximo de los dos es: " + maxNumero(num1, num2));
    }
}
