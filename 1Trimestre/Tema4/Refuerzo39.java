import java.util.Scanner;

public class Refuerzo39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();
        } while (numero < 0);

        System.out.println(convierteEnPalabras(numero));
    }

    public static String convierteEnPalabras(int numero) {
        int cifra;
        String palabras = "";
        int contador = 0;

        for (; numero > 0; numero /= 10) {
            cifra = numero % 10;
            contador++;
            if (contador == 1) {
                palabras = palabras(cifra) + " " + palabras; // lo va encadenando en orden
            } else {
                palabras = palabras(cifra) + ", " + palabras; // lo va encadenando en orden
            }
        }
        return palabras;
    }

    public static String palabras(int cifra) {
        String palabras = "";

        switch (cifra) {
            case 0 -> palabras = "cero";
            case 1 -> palabras = "uno";
            case 2 -> palabras = "dos";
            case 3 -> palabras = "tres";
            case 4 -> palabras = "cuatro";
            case 5 -> palabras = "cinco";
            case 6 -> palabras = "seis";
            case 7 -> palabras = "siete";
            case 8 -> palabras = "ocho";
            case 9 -> palabras = "nueve";

            default -> palabras = "error en el numero";
        }
        return palabras;
    }
}
