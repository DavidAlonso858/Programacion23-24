package examentema8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Ejercito ej1 = new Ejercito();
        Ejercito ej2 = new Ejercito();

        do {

            System.out.println("----MENU----");
            System.out.println("1. Mostrar ejercitos");
            System.out.println("2. Atacar al ejercito 1");
            System.out.println("3. Atacar al ejercito 2");
            System.out.print("Elija la opcion del menu (pulse 0 para salir): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Adios.");
                    break;
                case 1:
                    System.out.println(ej1);
                    System.out.println(ej2);
                    break;
                case 2:
                    ej2.atacar(ej1);
                    System.out.println(ej1);
                    break;
                case 3:
                    ej1.atacar(ej2);
                    System.out.println(ej2);
                    break;
                default:
                    System.out.println("Fallo al introducir opcion");
                    break;
            }
        } while (opcion != 0);
    }

}
