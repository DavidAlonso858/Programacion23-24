import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edades, suma = 0, contador = 0, mayorEdad = 0;

        System.out.print("Introduzca la edad del alumno: ");
        edades = sc.nextInt();

        while (edades >= 0) {
            suma += edades;

            if (edades >= 18) {
                mayorEdad++;
            }
            System.out.print("Introduzca la edad del alumno: ");
            edades = sc.nextInt();
            contador++;
        }
        System.out.println("La suma de las edades es: " + suma);
        System.out.println("La media es: " + (suma / contador));
        System.out.println("El numero de alumnos es: " + contador);
        System.out.println("Mayores de edad: " + mayorEdad);
    }
}
