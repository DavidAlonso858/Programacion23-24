import java.util.Scanner;

public class Refuerzo35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {

            System.out.println("Introduzca un numero: ");
            numero = sc.nextInt();
        } while (numero < 0);

        System.out.println(convierteEnPalotes(numero));
    }

    public static String convierteEnPalotes(int numero) {
        int cifra;
        String palillos = "";

        for (; numero > 0; numero /= 10) {
            cifra = numero % 10;
            switch (cifra) {
                case 0 -> palillos = " -" + palillos;
                case 1 -> palillos = "|-" + palillos;
                case 2 -> palillos = "||-" + palillos;
                case 3 -> palillos = "|||-" + palillos;
                case 4 -> palillos = "||||-" + palillos;
                case 5 -> palillos = "|||||-" + palillos;
                case 6 -> palillos = "||||||-" + palillos;
                case 7 -> palillos = "|||||||-" + palillos;
                case 8 -> palillos = "||||||||-" + palillos;
                case 9 -> palillos = "|||||||||-" + palillos;

                default -> palillos = "error en el numero";
            }
        }
        return palillos;
    }
}
