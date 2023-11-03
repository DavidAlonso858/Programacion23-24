import java.util.Scanner;

/*SOLICITA AL USUARIO UN NUMERO n 
Y DIBUJA UN TRIANGULO DE BASE Y ALTURA n, 
DE LA FORMA (PARA n IGUAL A 4)
*/
public class Ejercicio316Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFilas, altura, asteriscos;

        do {
            System.out.print("Introduzca el numero de filas: ");
            numFilas = sc.nextInt();
        } while (numFilas < 0);

        for (altura = 1; altura <= numFilas; altura++) {
            for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
                System.out.print(" ");
            }

            for (asteriscos = 1; asteriscos <= altura; asteriscos++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}