import java.util.Scanner;

public class RepasoExtra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, unidad = 0, decena = 0, centena = 0, resultado = 0;

        System.out.print("Introduzca el numero: ");
        numero = sc.nextInt();

        if (numero >= -999 && numero <= 999) {
            unidad = numero % 10;
            decena = (numero / 10) % 10;
            centena = numero / 100;

            if (numero >= 0 && numero < 10) {
                resultado = unidad;
            } else if (numero < 100) {
                resultado = (unidad * 10) + decena;
            } else {
                resultado = unidad * 100 + decena * 10 + centena;
            }

            System.out.println(numero + " -> " + Math.abs(resultado));
        } else {
            System.out.println("El número introducido no cumple el formato requerido");
        }
    }
}
