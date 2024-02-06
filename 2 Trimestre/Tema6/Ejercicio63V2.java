import java.util.Scanner;

public class Ejercicio63V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña, adivina;
        int compararPalabras, longitud;

        System.out.print("Introduzca la contraseña Jugador 1: ");
        contraseña = sc.nextLine();

        longitud = contraseña.length();
        System.out.println("La contraseña tiene una longitud de " + longitud + " caracteres\n");
        do {
            System.out.print("Adivina la contraseña: ");
            adivina = sc.nextLine();
            pista(adivina, contraseña, longitud);
        } while (!contraseña.equals(adivina));

        System.out.println("ACERTASTE");
    }

    public static void pista(String adivina, String contraseña, int longitud) {
        String pista = "";
        if (adivina.length() < longitud || adivina.length() > longitud) {
            System.out.println("Te has equivocado con la longitud de la palabra");
        } else
            for (int i = 0; i < longitud; i++) {
                if (contraseña.charAt(i) == adivina.charAt(i)) {
                    pista += contraseña.charAt(i); // se añade las letras que coincida
                } else {
                    pista += '*';
                }
            }
        System.out.println(pista);
    }
}
