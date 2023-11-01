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

        for (altura = 0; altura <= numFilas; altura++) {
            for (int blancos = 0; blancos <= numFilas - altura; blancos++) {
                System.out.print(" ");
            }

            for (asteriscos = 1; asteriscos <= (altura * 2) +1 ; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}