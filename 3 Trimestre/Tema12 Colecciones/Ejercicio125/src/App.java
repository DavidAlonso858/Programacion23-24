import java.util.Collection;
import java.util.LinkedList;

public class App {

    public static int aleatorio20() {
        int numero;

        numero = (int) (Math.random() * (11 - 1) + 1);

        return numero;
    }

    public static void main(String[] args) {
        Collection<Integer> numerosAleatorios = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            numerosAleatorios.add(aleatorio20());
        }

        System.out.println("LISTA CON REPETICIONES");
        System.out.println(numerosAleatorios);

        Collection<Integer> noRepetidos = new LinkedList<>();

        for (Integer i : numerosAleatorios) {
            if (!noRepetidos.contains(i)) { // false si no lo contiene para que no añada repetidos
                noRepetidos.add(i);
            }
        }

        System.out.println("LISTA SIN REPETICIONES");
        System.out.println(noRepetidos);
    }
}
