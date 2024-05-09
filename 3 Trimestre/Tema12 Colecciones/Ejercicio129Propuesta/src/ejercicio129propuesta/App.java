package ejercicio129propuesta;

import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        Set<Clientes> conjuntoClientes = new TreeSet<>();

        conjuntoClientes.add(new Clientes("111", "Marta", 20));
        conjuntoClientes.add(new Clientes("112", "Carlos", 18));
        conjuntoClientes.add(new Clientes("115", "Jorge", 21));

        System.out.println(conjuntoClientes); // ordenado por edad en el compareTo

        Set<Clientes> conjuntoClientes2 = new TreeSet<>((c1, c2) -> c1.getNombre().compareTo(c2.getNombre()));
        // lambda de objetos IMPORTANTE!

        conjuntoClientes2.add(new Clientes("111", "Marta", 20));
        conjuntoClientes2.add(new Clientes("112", "Carlos", 18));
        conjuntoClientes2.add(new Clientes("115", "Jorge", 21));

        System.out.println(conjuntoClientes2); // ordenado por el nombre con la expresion
    }
}
