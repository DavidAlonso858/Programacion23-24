package aplicacion1;

import embarcaciones1.Acorazado;
import embarcaciones1.Barco;
import embarcaciones1.Submarino;
import flota1.Flota;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static Integer menu() {
        Integer opcion;

        do {
            System.out.println("\n----MENU----");
            System.out.println("1. Introducir barco");
            System.out.println("2. Eliminar barco");
            System.out.println("3. Mostrar numero de barcos");
            System.out.println("4. Mostrar barcos por orden de insercion en la flota");
            System.out.println("5. Mostrar barcos por longitud de menor a mayor");
            System.out.println("6. Mostrar los metros de longitud de todos los periscopios de la flota");
            System.out.println("7. Recibe la flota un ataque");
            System.out.println("0. Salir");

            System.out.print("Introduzca la opcion deseada: ");
            opcion = sc.nextInt();

            sc.nextLine();
        } while (opcion < 0 || opcion > 7);

        return opcion;
    }

    public static void insertar(Flota f1) {
        Integer opcion;
        do {
            System.out.println("\n----Periodo Insercion----");
            System.out.println("1. Insertar acorazado");
            System.out.println("2. Insertar submarino");
            System.out.println("3. Salir");
            System.out.print("Introduzca la opcion a insertar: ");
            opcion = sc.nextInt();

            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    Double longitud;
                    Integer numCa;
                    System.out.print("Introduzca la longitud: ");
                    longitud = sc.nextDouble();

                    System.out.print("Introduzca el numero de cañones: ");
                    numCa = sc.nextInt();

                    Acorazado Ac = new Acorazado(longitud, numCa);
                    System.out.println(f1.insertarBarco(Ac));
                }
                case 2 -> {
                    Double longitud;
                    System.out.print("Introduzca la longitud: ");
                    longitud = sc.nextDouble();

                    Submarino sub = new Submarino(longitud);
                    System.out.println(f1.insertarBarco(sub));
                }

            }
        } while (opcion != 3);
    }

    public static void eliminarBarco(Flota f1) {
        double longi;
        System.out.print("Introduce la longitud del barco a eliminar: ");
        longi = sc.nextDouble();

        System.out.println(f1.eliminarBarco(new Submarino(longi)));
    }

    public static void main(String[] args) {
        Integer opcion;
        Flota f1 = new Flota();
        do {
            opcion = menu();
            switch (opcion) {
                case 1 -> {
                    insertar(f1);
                }
                case 2 -> {
                    eliminarBarco(f1);
                }
                case 3 -> {
                    System.out.println(f1.numeroBarcos());
                }
                case 4 -> {
                    System.out.println(f1.listadoBarcos());
                }
                case 5 -> {
                    List<Barco> l = f1.listadoBarcos();

                    Collections.sort(l, (b1, b2) -> b1.getLongitud().compareTo(b2.getLongitud()));
                    System.out.println(l);
                }
                case 6 -> {
                    System.out.println(f1.longitudPeriscopioFlota());
                }
                case 7 -> {
                    System.out.println(f1.recibirAtauqe());

                }
                case 0 -> {
                    System.out.println("Espero que haya ido todo bien!");

                }

            }
        } while (opcion != 0);
    }
}
