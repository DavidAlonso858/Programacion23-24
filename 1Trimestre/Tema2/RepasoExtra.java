import java.util.Scanner;

public class RepasoExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;

        System.out.print("Introduzca el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduzca el segundo numero: ");
        num2 = sc.nextInt();

        System.out.print("Introduzca el operador (-,+,*,/): ");
        operador = sc.next().charAt(0);

        switch (operador) {
            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.println("El resultado es: " + resultado);
                break;
            default:System.out.println("error");
        }
    }
}
