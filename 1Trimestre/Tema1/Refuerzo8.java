import java.util.Scanner;

/*
 * Escribe un programa que calcule el salario semanal de un empleado 
 * en base a las horas trabajadas, a razon de 12 euros la hora.
 */

public class Refuerzo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salarioSem, horas;        
        
        System.out.println("Introduzca el numero de horas trabajadas en la semana: ");
        horas=sc.nextInt();

        salarioSem = 12 * horas;

        System.out.println("En total gana a la semana: " +salarioSem + " euros ");
    }
}
