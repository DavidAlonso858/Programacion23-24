import java.util.Scanner;

/*
 * Escribe un programa que calcule el volumen de 
 * V = 1/3 * Pi * r*r * h
 */
public class Refuerzo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h, r, V;

        System.out.println("Introduzca la h: ");
        h = sc.nextDouble();

        System.out.println("Introduzca la r: ");
        r = sc.nextDouble();

        V = (1.0 / 3.0) * Math.PI * (Math.pow(r, 2)) * h;

        System.out.println("El volumen del cono es de: " + V);
    }
}
