import java.util.Scanner;

public class RefuerzoExtra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, digito, digBelen = 0, longitud = 0, posicion = 1, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE,
                segundoMenor = Integer.MAX_VALUE;

        do {
            System.out.print("Introduzca un numero positivo de tres cifras minimo: ");
            num = sc.nextInt();
        } while (num < 99 || num < 0);

        int temp = num;
        while (temp > 0) {
            temp /= 10;
            longitud++;
        }

        if (num % 2 == 0) {
            int aux = num;
            while (aux > 0) {
                digito = aux % 10;
                if (digito > mayor) {
                    mayor = digito;
                }
                if (digito < menor) {
                    segundoMenor = menor;
                    menor = digito;
                } else if (digito < segundoMenor && digito != menor) {
                    segundoMenor = digito;
                }
                aux /= 10;
            }
            System.out.println("El numero de Belen es: " + (mayor - segundoMenor));
        } else {
            int aux2 = num;
            while (aux2 > 0) {
                longitud = (longitud / 2) + 1;
                digito = aux2 % 10;
                if (longitud == posicion) {
                    digBelen = digito;
                }
                posicion++;
                aux2 /= 10;
            }
            System.out.println("El numero de Belen es: " + digBelen);
        }
    }
}
