package refuerzo25mapasocio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static int menu() {
        int opcion;
        System.out.println("\n--- MENU ---");

        System.out.println("1. Alta socio");
        System.out.println("2. Baja socio");
        System.out.println("3. Modificacion socio");
        System.out.println("4. Listar socios por apodo");
        System.out.println("5. Listar socios por antiguedad");
        System.out.println("6. Listar los socios con alta anterior a un año determinado");
        System.out.println("7. Salir");

        System.out.print("Introduzca la opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();

        return opcion;

    }

    public static void alta(Map<String, Socio> club) {
        String apodo, nombre, fechaIngreso;

        System.out.print("\nIntroduzca el apodo del nuevo socio: ");
        apodo = sc.nextLine();

        System.out.print("Introduzca el nombre del nuevo socio: ");
        nombre = sc.nextLine();

        System.out.print("Introduzca la fecha de ingreso (dd/MM/yyyy): ");
        fechaIngreso = sc.nextLine();

        club.put(apodo, new Socio(apodo, nombre, fechaIngreso));
    }

    public static void baja(Map<String, Socio> club) {
        String apodoEliminar;

        System.out.print("\nIntroduzca el apodo del socio para darse de baja: ");
        apodoEliminar = sc.nextLine();

        club.remove(apodoEliminar);
    }

    public static void modifacion(Map<String, Socio> club, String apodoModi) {
        String nombre = "", fechaIngreso = "";
        Socio s1 = club.get(apodoModi); // para modificar el socio con esa clave
        int opcion;

        do {
            System.out.println("\n-- PERIODO MODIFICACION--");
            System.out.println("1. Modificar nombre");
            System.out.println("2. Modificar fecha de ingreso");
            System.out.println("3. No modificar nada mas");

            System.out.print("Introduzca la opcion a modificar: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("\nIntroduzca nuevo nombre: ");
                    nombre = sc.nextLine();
                    s1.setNombre(nombre); // modifco eso manteniendo lo demas
                }
                case 2 -> {
                    System.out.print("\nIntroduzca nueva fecha de ingreso (dd/MM/yyyy): ");
                    fechaIngreso = sc.nextLine();
                    s1.setFechaIngreso(fechaIngreso); // modifco eso manteniendo lo demas
                }
                case 3 -> {
                    System.out.println("Tenga un buen dia caballero/señorita!");
                }
            }
        } while (opcion != 3);
    }

    public static List<Socio> ordenAño(Map<String, Socio> club, int año) {
        Set<Map.Entry<String, Socio>> ordenAño = club.entrySet();

        Iterator<Map.Entry<String, Socio>> it = ordenAño.iterator(); // iterator Map.Entry
        List<Socio> listaOrdenAño = new LinkedList<>();

        while (it.hasNext()) {
            Map.Entry<String, Socio> mapEntry = it.next();
            if (mapEntry.getValue().getFechaIngreso().getYear() < año) { // elimina para ordenar los anteriores a año
                listaOrdenAño.add(mapEntry.getValue());
            }
        }
        Collections.sort(listaOrdenAño, (s1, s2) -> s2.antiguedad() - s1.antiguedad());
        return listaOrdenAño;
    }

    public static void main(String[] args) {
        int opcion;
        // Las claves en los mapas son unicas
        Map<String, Socio> club = null; // TreeMap orden clave sin necesidad de compareTo

        if (Files.exists(Paths.get("club.dat"))) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("club.dat"))) {
                club = (TreeMap<String, Socio>) in.readObject(); // se castea el tipo para leer

            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            club = new TreeMap<>();
        }

        do {
            opcion = menu();
            switch (opcion) {
                case 1 -> {
                    alta(club);
                }
                case 2 -> {
                    baja(club);
                }

                case 3 -> {
                    String apodoModi;
                    do {

                        System.out.print("\nIntroduzca el apodo del socio a modificar: ");
                        apodoModi = sc.nextLine();
                        club.containsKey(apodoModi);

                    } while (!club.containsKey(apodoModi));

                    modifacion(club, apodoModi);

                }
                case 4 -> {
                    System.out.println("Orden alfabetico -> \n" + club);
                }
                case 5 -> {
                    Collection<Socio> clubAntiguedad = club.values(); // pasa los valores de Mapa
                    List<Socio> listaClubAntiguedad = new LinkedList<>(clubAntiguedad); // pasa esa Collection a List
                                                                                        // para usar el sort

                    Collections.sort(listaClubAntiguedad, (s1, s2) -> s2.antiguedad() - s1.antiguedad());
                    // de mayor a menor
                    System.out.println("Orden de antiguedad -> \n" + listaClubAntiguedad);
                }
                case 6 -> {
                    int año;
                    System.out.print("Hasta que año quiere la lista de socios: ");
                    año = sc.nextInt();
                    System.out.println("Orden con alta anterior a " + año + "-> \n" + ordenAño(club, año));

                }
                case 7 -> {
                    System.out.println("Espero que haya ido todo bien!");
                }

            }
        } while (opcion != 7);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("club.dat"))) {
            out.writeObject(club);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
