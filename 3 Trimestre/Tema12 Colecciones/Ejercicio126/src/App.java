import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static int aleatorio100() {
        int numero;

        numero = (int) (Math.random() * (11 - 1) + 1);

        return numero;
    }

    public static void main(String[] args) {
        Collection<Integer> numerosAleatorios = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            numerosAleatorios.add(aleatorio100());
        }
        System.out.println("LISTA CON REPETIDOS");
        System.out.println(numerosAleatorios);
        System.out.println(numerosAleatorios.size());

        Iterator<Integer> it = numerosAleatorios.iterator();

        while (it.hasNext()) {
            int n = it.next();
            if (n == 5) {
                it.remove();
            }
        }

        System.out.println("LISTA SIN 5");
        System.out.println(numerosAleatorios);
        System.out.println(numerosAleatorios.size());
    }
}
