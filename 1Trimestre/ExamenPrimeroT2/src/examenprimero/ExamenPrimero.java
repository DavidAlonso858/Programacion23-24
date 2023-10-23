package examenprimero;

import java.util.Scanner;

public class ExamenPrimero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2, resultado;
        char operador;

        System.out.print("Introduzca el primer valor: ");
        numero1 = sc.nextDouble();

        System.out.print("Introduzca el segundo valor: ");
        numero2 = sc.nextDouble();

        System.out.print("Introduzca el operador (+,-,*,/): ");
        operador = sc.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("El resultado de la operacion es: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("El resultado de la operacion es: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("El resultado de la operacion es: " + resultado);
                break;
            case '/':
                resultado = numero1 / numero2;
                System.out.println("El resultado de la operacion es: " + resultado);
                break;
            default:
                resultado = 0.0;
                System.out.println("Operador invalido");
                System.out.println("El resultado de la operacion es: " + resultado);
                break;
        }
    }
}
