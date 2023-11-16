import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Introduzca un numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduzca otro numero: ");
        num2 = sc.nextInt();

        numerosCompredidos(num1, num2);
    }

    public static void numerosCompredidos(int num1Pasado, int num2Pasado) {
        int mayor, menor;
        if (num1Pasado > num2Pasado) {
            mayor = num1Pasado;
            menor = num2Pasado;
        } else {
            mayor = num2Pasado;
            menor = num1Pasado;
        }
        for (; menor <= mayor; menor++) {
            System.out.println(menor);
        }
    }

}
