import java.util.Scanner;

public class Ejercicio45 {
    public static boolean esVocal(char letra) {
        boolean vocal;

        switch (letra) {
            case 'a' -> vocal = true;
            case 'A' -> vocal = true;
            case 'e' -> vocal = true;
            case 'E' -> vocal = true;
            case 'i' -> vocal = true;
            case 'I' -> vocal = true;
            case 'o' -> vocal = true;
            case 'O' -> vocal = true;
            case 'u' -> vocal = true;
            case 'U' -> vocal = true;
            default -> vocal = false;
        }
        return vocal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letra;

        System.out.print("Introduzca una letra: ");
        letra = sc.next().charAt(0);

        System.out.println("Dicha letra es una vocal: " + esVocal(letra));
    }

}
