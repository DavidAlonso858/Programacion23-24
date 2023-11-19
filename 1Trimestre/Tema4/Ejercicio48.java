import java.util.Scanner;

public class Ejercicio48 {

    public static double calculadora(double num1, double num2, int operacion) {
        double resultado = 0;
        switch (operacion) {
            case 1 -> resultado = num1 + num2;
            case 2 -> resultado = num1 - num2;
            case 3 -> resultado = num1 * num2;
            case 4 -> resultado = num1 / num2;

            default -> System.out.println("error");
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        int operacion;

        System.out.print("Introduzca un numero: ");
        num1 = sc.nextDouble();

        System.out.print("Introduzca otro numero: ");
        num2 = sc.nextDouble();

        do {
            System.out.print("Introduzca la operacion (1=suma, 2=resta, 3=multiplicacion y 4=division): ");
            operacion = sc.nextInt();
        } while (operacion < 1 || operacion > 4);

        double result = calculadora(num1, num2, operacion);
        System.out.println("El resultado de esa operacion es: " + result);
    }
}
