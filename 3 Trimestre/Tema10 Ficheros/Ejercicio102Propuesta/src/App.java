import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        double metros;

        System.out.print("Introduce el nombre, la edad y los metros: ");
        nombre = sc.next();
        edad = sc.nextInt();
        metros = sc.nextDouble();

        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Estatura: " + metros);
    }
}
