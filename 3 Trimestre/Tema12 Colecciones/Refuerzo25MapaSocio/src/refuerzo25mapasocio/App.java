package refuerzo25mapasocio;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static int menu() {
        int opcion;

        System.out.println("1. Alta socio");
        System.out.println("2. Baja socio");
        System.out.println("3. Modificacion socio");
        System.out.println("4. Listar socios por apodo");
        System.out.println("5. Listar socios por antiguedad");
        System.out.println("6. Listar los socios con alta anterior a un año determinado");
        System.out.println("7. Salir");

        System.out.print("Introduzca la opcion: ");
        opcion = sc.nextInt();

        return opcion;

    }

    public static void main(String[] args) {
        int opcion;
        Map<String, Socio> club = new LinkedHashMap<>();
        
        do {
            opcion = menu();
            switch (opcion) {
                case value:

                    break;

                default:
                    break;
            }
        } while (opcion != 7);
    }
}
