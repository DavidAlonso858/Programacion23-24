package examentema3ejercicio2;

import java.util.Scanner;

public class ExamenTema3Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, segundoNumeroMenor = Integer.MAX_VALUE, numero, longitud = 0, digitoPar, digitoImpar, posicion = 1, digitoBelen;

        do {
            System.out.print("Introduzca un numero positivo de al menos tres cifras: ");
            numero = sc.nextInt();
        } while (numero < 0 || numero < 99);

        int numTemporal = numero;

        while (numTemporal > 0) {
            numTemporal /= 10;
            longitud++;
        }

        if (longitud % 2 == 0) {
            int aux = numero;
            while (aux > 0) {
                digitoPar = aux % 10;
                if (digitoPar > mayor) {
                    mayor = digitoPar;
                }
                if (digitoPar < menor) {
                    segundoNumeroMenor = menor;
                    menor = digitoPar;
                } else if (digitoPar < segundoNumeroMenor && digitoPar != menor) {
                    segundoNumeroMenor = digitoPar;
                }
                aux /= 10;
            }
            System.out.println("El digito de Belen es: " + (mayor - segundoNumeroMenor));
        } else {
            int aux2 = numero;
            boolean encontrado = false;
            longitud = (longitud / 2) + 1;
            while (aux2 > 0 && !encontrado) {
                digitoImpar = aux2 % 10;
                if (longitud == posicion) {
                    digitoBelen = digitoImpar;
                    System.out.println("El digito de Belen es: " + digitoBelen);
                    encontrado = true;
                }
                aux2 /= 10;
                posicion++;
            }
        }
    }
}
