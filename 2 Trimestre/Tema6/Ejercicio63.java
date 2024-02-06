import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña, adivina;
        int compararPalabras;

        System.out.println("Introduzca la contraseña Jugador 1: ");
        contraseña = sc.nextLine();

        do {
            System.out.print("Adivina la contraseña: ");
            adivina = sc.nextLine();

            compararPalabras = contraseña.compareToIgnoreCase(adivina);

            if (compararPalabras == 0) {
                System.out.println("Acertaste");
            } else if (compararPalabras < 0) {
                System.out.println("La contraseña es menor");
            } else {
                System.out.println("La contraseña es mayor");
            }
        } while (!contraseña.equals(adivina));

    }
}
