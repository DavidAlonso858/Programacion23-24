package ejercicio2t1;

import java.util.Scanner;

public class Ejercicio2T1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int lado;
        double area;

        System.out.print("Introduzca un lado del triangulo: ");
        lado = teclado.nextInt();

        area = (Math.sqrt(3) / 4.0) * (lado * lado);

        System.out.print("El area del triangulo es: \n" + area);
    }
}
