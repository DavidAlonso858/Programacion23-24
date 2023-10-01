import java.util.Scanner;

public class Ejercicio122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double metros, cm;

        System.out.println("Introduzca los metros exactos: ");
        metros = sc.nextDouble();

        cm = metros * 100;

        System.out.println("El resultado en centimetros es de: " + (int) cm);
    }
}
