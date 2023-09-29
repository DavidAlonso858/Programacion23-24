import java.util.Scanner;

public class Ejercicio120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real, raiz;

        System.out.println("Introduzca el numero real por favor: ");
        real = sc.nextDouble();

        raiz = Math.sqrt(real);

        System.out.println("La raiz cuadrada es: " + raiz);

    }
}
