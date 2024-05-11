import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static int menu() {
        int opcion;
        System.out.println("\n----MENU TEMPERATURA----");

        System.out.println("1. Nuevo Registro");
        System.out.println("2. Listar Registros");
        System.out.println("3. Mostrar estadisticas (maximo, minimo, media)");
        System.out.println("4. Salir");
        System.out.print("Introduzca la opcion deseada: ");
        opcion = sc.nextInt();

        return opcion;
    }

    public static void maximo(Set<Registro> conjuntoRegistros) {
        System.out.println("Maximo: " +
                Collections.max(conjuntoRegistros,
                        (c1, c2) -> Double.compare(c1.getTemperatura(), c2.getTemperatura())));
    }

    public static void minimo(Set<Registro> conjuntoRegistros) {
        System.out.println("Minimo: " +
                Collections.min(conjuntoRegistros,
                        (c1, c2) -> Double.compare(c1.getTemperatura(), c2.getTemperatura())));
    }

    public static void media(Set<Registro> conjuntoRegistros) {
        Iterator<Registro> it = conjuntoRegistros.iterator();
        double suma = 0;
        while (it.hasNext()) {
            suma += it.next().getTemperatura();
        }
        System.out.printf("Media: %.4f%n", suma / conjuntoRegistros.size());
    }

    public static void main(String[] args) {
        Set<Registro> conjuntoRegistros = new LinkedHashSet<>();
        int opcion;
        double t, suma;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("registro.dat"))) {
            conjuntoRegistros = (LinkedHashSet<Registro>) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        do {
            opcion = menu();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduzca la temperatura: ");
                    t = sc.nextDouble();
                    conjuntoRegistros.add(new Registro(t));

                }
                case 2 -> System.out.println(conjuntoRegistros);
                case 3 -> {// lambda que compara double en vez de un comparator
                    maximo(conjuntoRegistros);
                    minimo(conjuntoRegistros);
                    media(conjuntoRegistros);
                }
                case 4 -> System.out.println("Espero que se haya registrado todo bien");
            }
        } while (opcion != 4);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("registro.dat"))) {
            out.writeObject(conjuntoRegistros);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
