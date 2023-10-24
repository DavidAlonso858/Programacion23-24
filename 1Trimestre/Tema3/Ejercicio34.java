import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, max = -1;
        int arbol = 0;

        System.out.print("Introduzca la altura en cm: ");
        altura = sc.nextDouble();
        System.out.println("Arbol: " + arbol);

        while (altura != -1) {
            if (altura > max) {
                max = altura;
            }
            System.out.print("Introduzca la altura en cm: ");
            altura = sc.nextDouble();
            arbol++;
            System.out.println("Arbol: " + arbol);
        }
        System.out.println("El arbol mas alto es: " + max);
    }
}
