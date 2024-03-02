import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadenaOriginal;

        System.out.print("Introduce una frase (todo en minusculas): ");
        cadenaOriginal = sc.nextLine();

        CifradoCesar.cadenaCifrada(cadenaOriginal, 3);
    }
}
