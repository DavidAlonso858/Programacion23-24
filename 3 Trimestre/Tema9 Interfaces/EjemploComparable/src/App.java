import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Socio[] socios = {
                new Socio(1, "Pepe", "01-01-2001"),
                new Socio(2, "Rosa", "01-01-2004"),
                new Socio(21, "Pablo", "08-01-2002")
        };

        Socio s1 = new Socio(21, "Pablo", "08-01-2002");
        Socio s2 = new Socio(4, "Juan", "08-01-2000");

        Arrays.sort(socios); // lo ordena segun el compareTo que se crea en la clase Socio
        System.out.println(Arrays.toString(socios));

        Arrays.sort(socios, new ComparaEdades().reversed()); // lo llamo asi para que lo ordene con el Compare que
                                                             // siempre se crea en una nueva clase.
                                                             // El reversed lo ordena al reves.

        Arrays.sort(socios, new ComparadorNombres());
        System.out.println(Arrays.toString(socios));
        System.out.println(
                "Posicion del s1 en el array: " + Arrays.binarySearch(socios, s1, new ComparaEdades().reversed()));
        // le paso el mismo orden del sort

        // System.out.println("Por cuantos años es mayor Pepe: " + s1.compareTo(s2));

    }
}
