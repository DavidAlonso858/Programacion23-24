import java.util.Scanner;

public class Ejercicio618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase, camelCase;

        System.out.print("Ingrese una frase: ");
        frase = scanner.nextLine();

        camelCase = convertirCamelCase(frase);

        System.out.println("Frase en CamelCase: " + camelCase);

    }

    public static String convertirCamelCase(String frase) {
        // Dividir la frase en palabras
        String[] palabras = frase.split(" ");
        String resultado = "", primeraLetra = "", restoPalabra = "";

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];

            // primera letra de la palabra a minúscula
            primeraLetra = palabra.substring(0, 1).toLowerCase();

            // resto de la palabra a minúscula
            restoPalabra = palabra.substring(1).toLowerCase();

            // la primera letra a mayúscula
            if (i > 0) {
                primeraLetra = primeraLetra.toUpperCase();
            }

            resultado += primeraLetra + restoPalabra;
        }

        return resultado;
    }
}