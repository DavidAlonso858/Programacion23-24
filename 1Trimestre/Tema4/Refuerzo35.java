import java.util.Scanner;

public class Refuerzo35 {

    public static String convierteEnPalotes(int numero) {
        int cifra;
        String palillos = "";

        for (; numero > 0; numero /= 10) {
            cifra = numero % 10;
            palillos = palillos(cifra) + palillos;
        }
        return palillos;
    }

    public static String palillos(int cifra) {
        String palillos = "";
        switch (cifra) {
            case 0 -> palillos = " -";
            case 1 -> palillos = "|-";
            case 2 -> palillos = "||-";
            case 3 -> palillos = "|||-";
            case 4 -> palillos = "||||-";
            case 5 -> palillos = "|||||-";
            case 6 -> palillos = "||||||-";
            case 7 -> palillos = "|||||||-";
            case 8 -> palillos = "||||||||-";
            case 9 -> palillos = "|||||||||-";

            default -> palillos = "error en el numero";
        }
        return palillos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();
        } while (numero < 0);

        System.out.println(convierteEnPalotes(numero));
    }

}
