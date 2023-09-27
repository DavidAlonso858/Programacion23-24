import java.util.Scanner;

public class EjercicioMayorEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        boolean mayorEdad;
        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();

        mayorEdad = edad >= 18;

        System.out.println("Su hijo es mayor de edad?: " + mayorEdad);

    }
}
