package ejercicio1t1;

import java.util.Scanner;

public class Ejercicio1T1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, mayor, menor;
        boolean divisible;
        String cero;

        System.out.print("Introduce el primer numero si es tan amable: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el primer segundo si es tan amable: ");
        num2 = sc.nextInt();

        mayor = (num1 > num2) ? num1 : num2;
        menor = !(num1 > num2) ? num1 : num2;
        divisible = (mayor % menor == 0);

        System.out.println("El numero " + mayor + " es divisible por " + menor + " ? " + divisible);
    }
}
