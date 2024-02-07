import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio614Agenda {

    public static int menu(Scanner sc) {
        int opcion;
        do {
            System.out.println("\n\t\t-- Agenda --");
            System.out.println("Opcion 1. Añade un nuevo contacto (nombre y telefono)");
            System.out.println("Opcion 2. Buscar el telfono de un contacto a partir de su nombre");
            System.out.println("Opcion 3. Mostrar la informacion de todos los contactos ordenados afabeticamente");
            System.out.println("Opcion 4. Salir\n");

            System.out.print("Introduzca una opcion de la Agenda: ");
            opcion = sc.nextInt();
            sc.nextLine(); // consumir la linea
        } while (opcion < 1 || opcion > 3);

        return opcion;
    }

    public static String[] insercion(String[] nuevaAgenda, String nuevoContacto) {
        String[] nuevo = Arrays.copyOf(nuevaAgenda, nuevaAgenda.length + 1);
        nuevo[nuevo.length - 1] = nuevoContacto;
        return nuevo;
    }

    public static String[] eleccion(Scanner sc, String[] nuevaAgenda, int opcion) {

        switch (opcion) {
            case 1:
                return agregarContacto(nuevaAgenda, sc);
            case 2:
                buscar(nuevaAgenda, sc);
                return nuevaAgenda;
            case 3:
                mostrarContactos(nuevaAgenda);
                return nuevaAgenda;
        }

        return nuevaAgenda;
    }

    public static String[] agregarContacto(String[] nuevaAgenda, Scanner sc) {
        String nombre, telefono, nuevoContacto;
        System.out.print("Introduce el nombre del contacto: ");
        nombre = sc.nextLine();
        System.out.print("Introduce el teléfono del contacto: ");
        telefono = sc.nextLine();
        nuevoContacto = nombre + ":" + telefono;
        nuevaAgenda = insercion(nuevaAgenda, nuevoContacto);

        return nuevaAgenda;
    }

    public static void buscar(String[] nuevaAgenda, Scanner sc) {
        String nombreBuscar;
        System.out.print("Introduce el nombre para buscar el telefono: ");
        nombreBuscar = sc.nextLine();

        boolean encontrado = false;
        for (int contacto = 0; contacto < nuevaAgenda.length && !encontrado; contacto++) {
            String[] partes = nuevaAgenda[contacto].split(":");
            if (partes[contacto].equals(nombreBuscar)) {
                System.out.println("Teléfono de " + nombreBuscar + ": " + partes[contacto + 1]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    public static void mostrarContactos(String[] nuevaAgenda) {
        Arrays.sort(nuevaAgenda);

        System.out.println("\nContactos☎️: ");
        for (int i = 0; i < nuevaAgenda.length; i++) {
            System.out.print(nuevaAgenda[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String[] nuevaAgenda = new String[0];

        do {
            opcion = menu(sc);
            if (opcion != 4) {
                nuevaAgenda = eleccion(sc, nuevaAgenda, opcion);

            }
        } while (opcion != 4);

    }
}
