import java.util.Scanner;

/*
 * Progrma que calcule la nota que hace falta sacar en el segundo examen
 * Hay que tener en cuenta que el primero vale 40% y el segundo 60% 
 */

public class Refuerzo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensajeSalida;
        double nota1, nota2, notaFinal;
        
        System.out.println("Introduzca la primera nota: ");
        nota1=sc.nextDouble();

        System.out.println("¿Que nota quieres sacar en el trimestre?: ");
        notaFinal=sc.nextDouble();

        nota2 = (notaFinal - nota1*0.40) /0.60;
        
        mensajeSalida = (nota2<0) || (nota2>10) ? " No puedes alcanzar esa nota" :
                                     ("\nNecesitas sacar la siguiente nota en el segundo examen: "+nota2); 

        System.out.println(mensajeSalida);
    }
}
