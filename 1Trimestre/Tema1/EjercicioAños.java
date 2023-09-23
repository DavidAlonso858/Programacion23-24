/*Escribe una aplicacion que pida el año actual y el de nacimiento. 
Debe calcular su edad suponiendo que ya ha cumplido años*/

import java.util.Scanner;

public class EjercicioAños {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int añoAc, añoNac, edad;

        System.out.print("Introduzca el año actual: ");
        añoAc = sc.nextInt();
        System.out.print("Introduzca su edad de nacimiento: ");
        añoNac = sc.nextInt();

        edad = añoAc - añoNac;

        System.out.println("Su edad es de: " + edad + " años");
    }
}
