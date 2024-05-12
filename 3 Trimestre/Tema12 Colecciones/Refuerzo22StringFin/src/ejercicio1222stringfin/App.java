package ejercicio1222stringfin;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String texto = "";
        Set<String> nombres = new LinkedHashSet<>(); // orden de insercion

        System.out.print("Introduzca nombres unicos (fin para salir): ");
        texto = sc.nextLine();

        while (!texto.equalsIgnoreCase("fin")) {
            nombres.add(texto);

            System.out.print("Introduzca nombres (fin para salir): ");
            texto = sc.nextLine();
        }

        if (nombres.isEmpty()) { // devuelve true si no hay
            System.out.println("No hay nombres registrados");
        } else {
            System.out.print("Nombres: ");
            System.out.println(nombres);
        }
    }
}
