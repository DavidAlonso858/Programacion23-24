package ejercicio1210todo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static int menu(Scanner sc) {
        int opcion;
        System.out.println("\n----MENU----");

        System.out.println("1. Alta nuevo socio");
        System.out.println("2. Baja de socio");
        System.out.println("3. Modificacion de socio");
        System.out.println("4. Listado por DNI");
        System.out.println("5. Listado por antiguedad");
        System.out.println("6. Salir");

        System.out.print("Introduzca la opcion deseada: ");
        opcion = sc.nextInt();
        sc.nextLine(); // limpia para que introduzca los datos sin problema

        return opcion;
    }

    public static boolean baja(Set<Socio> conjuntoSocios, String dni) {
        boolean eliminado = false;

        for (Socio socio : conjuntoSocios) {
            if (socio.getDni().equals(dni)) {
                eliminado = conjuntoSocios.remove(socio);
            }
        }
        return eliminado;
    }

    public static boolean alta(Scanner sc, Set<Socio> conjuntoSocios) {
        String dni, nombre, fechaAlta;
        System.out.print("Introduzca DNI del nuevo socio: ");
        dni = sc.nextLine();

        System.out.print("Introduzca NOMBRE del nuevo socio: ");
        nombre = sc.nextLine();

        System.out.print("Introduzca FECHA ALTA del nuevo socio (dd-MM-yyy): ");
        fechaAlta = sc.nextLine();

        Socio s = new Socio(dni, nombre, fechaAlta);

        return conjuntoSocios.add(s);
    }

    public static boolean modificacion(Scanner sc, Set<Socio> conjuntoSocios) {
        String dni, nombre, fechaAlta;

        System.out.print("Introduzca DNI del modificado: ");
        dni = sc.nextLine();

        System.out.print("\nIntroduzca NOMBRE del modificado: ");
        nombre = sc.nextLine();

        System.out.print("\nIntroduzca FECHA ALTA modifcado (dd-MM-yyy): ");
        fechaAlta = sc.nextLine();

        Socio s = new Socio(dni, nombre, fechaAlta);

        return conjuntoSocios.add(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String dni;
        Set<Socio> conjuntoSocios = new TreeSet<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {
            conjuntoSocios = (TreeSet<Socio>) in.readObject(); // c casteo del tipo al leelo

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        do {
            opcion = menu(sc);
            switch (opcion) {
                case 1 -> alta(sc, conjuntoSocios);
                case 2 -> {
                    System.out.print("Introduzca el dni que quiere darse de baja: ");
                    dni = sc.next();
                    sc.nextLine();
                    baja(conjuntoSocios, dni);
                }
                case 3 -> {
                    System.out.print("Introduzca el dni del socio que quiere modificar: ");
                    dni = sc.nextLine();
                    baja(conjuntoSocios, dni);

                    modificacion(sc, conjuntoSocios);
                }
                case 4 -> System.out.println(conjuntoSocios);
                case 5 -> { // orden de mas antiguo
                    List<Socio> ordenAntiguedad = new ArrayList<>(conjuntoSocios);
                    ordenAntiguedad.sort((s1, s2) -> s2.antiguedad() - s1.antiguedad());
                    System.out.println(ordenAntiguedad);
                }
                case 6 -> System.out.println("Espero que todo haya ido bien!");
            }
        } while (opcion != 6);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {
            out.writeObject(conjuntoSocios);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
