import java.util.Scanner;

public class Ejercicio115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x, y;

        System.out.println("Introduzca el valor de a: ");
        a = sc.nextDouble();
        
        System.out.println("Introduzca el valor de b: ");
        b = sc.nextDouble();
        
        System.out.println("Introduzca el valor de c: ");
        c = sc.nextDouble();
        
        System.out.println("Introduzca el valor de x: ");
        x = sc.nextDouble();

        y= a * Math.pow(x, 2) + b * x + c;

        System.out.println("El valor de y es el siguiente: " +y);
    }
}
