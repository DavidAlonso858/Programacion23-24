import java.util.Scanner;

/*
 * Calcular cuanto a que sumarle al entero
 * para que sea MULTIPLO DE 7 
 * 
 * (el resto es lo que le falta al numero 
 * para que la division entre 7 sea exacta 
 * y por tanto multiplo)
 */
public class Ejercicio112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entero, resto, suma;

        System.out.println("Introduza un numero entero: ");
        entero = sc.nextInt();

        resto = entero % 7;
        suma = 7 - resto;

        System.out.println("Hay que sumarle: " + suma);
    }
}
