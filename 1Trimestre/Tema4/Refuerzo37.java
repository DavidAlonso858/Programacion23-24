import java.util.Scanner;

public class Refuerzo37 {

    public static String convierteEnPalotes(int numero) {
        int aux = numero, cifra;
        String palillos = "";

        for (; aux > 0; aux /= 10) {
            cifra = aux % 10;
            palillos = palotes(cifra) + palillos;
        }
        return palillos;
    }

    public static String palotes(int cifra) {
        String palillos = "";
        switch (cifra) {
            case 0 -> palillos = " _ _ _ _ _";
            case 1 -> palillos = " . _ _ _ _";
            case 2 -> palillos = " . . _ _ _";
            case 3 -> palillos = " . . . _ _";
            case 4 -> palillos = " . . . . _";
            case 5 -> palillos = " . . . . .";
            case 6 -> palillos = " _ . . . .";
            case 7 -> palillos = " _ _ . . .";
            case 8 -> palillos = " _ _ _ . .";
            case 9 -> palillos = " _ _ _ _ .";

            default -> palillos = "error en el numero";
        }
        return palillos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduza un numerin: ");
            numero = sc.nextInt();
        } while (numero < 0);
        
        System.out.println("El numero " + numero + " en Morse es " + convierteEnPalotes(numero));
    }
}
