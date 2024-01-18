import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio511Combinacion {

    public static int aleatorio() {
        int numero;

        numero = (int) (Math.random() * (7) + 1);

        return numero;
    }

    public static void rellenarClaveSecreta(int[] claveSecreta) {
        for (int i = 0; i < claveSecreta.length; i++) {
            claveSecreta[i] = aleatorio();
        }
    }

    public static void rellenarClaveJugador(int[] claveJugador, Scanner sc) {
        for (int i = 0; i < claveJugador.length; i++) {
            System.out.print("Introduce el digito " + (i + 1) + " de la combinacion: ");
            claveJugador[i] = sc.nextInt();
        }
    }

    public static void Pistas(int[] claveSecreta, int[] claveJugador) {
        System.out.println("\nTe echo una mano: ");
        for (int i = 0; i < claveJugador.length; i++) {
            System.out.print(claveJugador[i]);

            if (claveSecreta[i] > claveJugador[i]) {
                System.out.print("\tel digito correcto es mayor");
            } else if (claveSecreta[i] < claveJugador[i]) {
                System.out.print("\tel digito correcto es menor");
            } else {
                System.out.print("\tiguales");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;

        do {
            System.out.print("La longitud de la tabla es (1-5): ");
            longitud = sc.nextInt();
        } while (longitud < 1 || longitud > 5);

        int[] claveSecreta = new int[longitud];
        int[] claveJugador = new int[longitud];

        rellenarClaveSecreta(claveSecreta);
        System.out.println(Arrays.toString(claveSecreta));
        rellenarClaveJugador(claveJugador, sc);

        while (!Arrays.equals(claveSecreta, claveJugador)) {
            Pistas(claveSecreta, claveJugador);
            System.out.println();
            rellenarClaveJugador(claveJugador, sc);
        }
        System.out.println("\nEnhorabuena por descubrir este gran secreto");
    }
}
