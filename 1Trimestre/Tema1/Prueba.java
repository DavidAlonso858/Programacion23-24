//Programa que pida y multiplique dos numeros

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;

        System.out.println("Me llamo David \n");

        System.out.print("Inserte un numero: ");
        num1 = sc.nextDouble();

        System.out.print("Inserte otro numero: ");
        num2 = sc.nextDouble();

        System.out.println("El resultado es: " + num1 * num2);
    }

}