import java.util.Scanner;

public class Ejercicio114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Introduce la altura del triangulo: ");
        altura = sc.nextInt();

        System.out.println("Introduce la base del triangulo: ");
        base = sc.nextInt();

        area = (base * altura) / 2.0;

        System.out.println("El are de ese triangulo es la siguiente: " + area);
    }
}
