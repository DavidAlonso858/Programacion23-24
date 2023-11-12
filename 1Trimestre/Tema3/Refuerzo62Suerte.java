import java.util.Scanner;

public class Refuerzo62Suerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, digito, suerte = 0, malaSuerte = 0, afortunado;

        do {
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();
        } while (numero < 0);

        int aux = numero;

        while (aux > 0) {
            digito = aux % 10;
            switch (digito) {
                case 3 -> suerte++;
                case 7 -> suerte++;
                case 8 -> suerte++;
                case 0 -> malaSuerte++;
                case 1 -> malaSuerte++;
                case 2 -> malaSuerte++;
                case 4 -> malaSuerte++;
                case 5 -> malaSuerte++;
                case 6 -> malaSuerte++;

            }
            aux /= 10;
        }
        afortunado = suerte - malaSuerte;

        if (afortunado > 0) {
            System.out.println("El " + numero + " es un numero afortunado");
        } else
            System.out.println("El " + numero + " no es un numero afortunado");
    }
}
