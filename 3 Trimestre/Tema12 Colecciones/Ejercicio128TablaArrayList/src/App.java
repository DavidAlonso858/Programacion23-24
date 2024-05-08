import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static int aleatorio20() {
        int n;

        n = (int) (Math.random() * (51 - 1) + 1);

        return n;
    }

    public static void main(String[] args) {
        Collection<Integer> convertirTabla = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            convertirTabla.add(aleatorio20());
        }
        System.out.println("\nOriginal");
        System.out.println(convertirTabla);
        // convierte de coleccion a tabla
        Integer[] tabla = convertirTabla.toArray(new Integer[0]);

        Arrays.sort(tabla);
        System.out.println("Coleccion pasada a Tabla");
        System.out.println(Arrays.toString(tabla));

        Arrays.sort(tabla, (n1, n2) -> n2 - n1); // es un comparator en si para que vaya de mayor a menor
        System.out.println(Arrays.toString(tabla));

        Collection<Integer> convertirColeccion = new LinkedList<>();

        // convierte de tabla a coleccion
        convertirColeccion.addAll(Arrays.asList(tabla));
        System.out.println("Tabla a Coleccion");
        System.out.println(convertirColeccion);
    }
}
