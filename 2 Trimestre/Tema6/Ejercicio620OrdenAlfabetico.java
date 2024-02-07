import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio620OrdenAlfabetico {

    public static void mostrarOrden(String[] palabras) {
        System.out.println("Palabras ordenadas: ");
        for (String palabra : palabras) {
            System.out.println("\t\t  " + palabra);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String[] palabras;

        System.out.print("Ingrese una frase: ");
        frase = sc.nextLine();

        palabras = frase.split(" "); // divir la frase en cada espacio
        Arrays.sort(palabras);

        mostrarOrden(palabras);

    }
}