package examensegundo;

import java.util.Scanner;

public class ExamenSegundo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, decena, unidad, centena, cifra=0;

        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();

        unidad = numero % 10;
        decena = (numero / 10) % 10;
        centena = numero / 100;

        if (numero > 999 || numero < -999) {
            System.out.println("El numero introducido no cumple con el formato requerido");
        } else if (numero < 10 && numero > -10) {
            cifra = Math.abs(unidad);
        } else if (numero < 100 && numero > -100) {
            cifra = Math.abs(unidad * 10 + decena);
        } else {
            cifra = Math.abs(unidad * 100 + decena * 10 + centena);
        }
        System.out.println(numero + " -> " + cifra);
    }
}
