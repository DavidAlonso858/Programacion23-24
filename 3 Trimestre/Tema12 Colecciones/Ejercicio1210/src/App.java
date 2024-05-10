import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static int aleatorio() {
        int n;

        n = (int) (Math.random() * (11 - 1) + 1);

        return n;
    }

    public static void main(String[] args) {
        List<Integer> lista20 = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            lista20.add(aleatorio());
        }
        System.out.println("LISTA ORIGINAL");
        System.out.println(lista20);
        
        Set<Integer> sinRepetir = new TreeSet<>();
        
        sinRepetir.addAll(lista20);
        System.out.println("CONJUNTO DE LA LISTA");
        System.out.println(sinRepetir);
        
        Iterator<Integer> it = sinRepetir.iterator();
        
        while (it.hasNext()) {
            lista20.remove(it.next());
        }
        
        Set<Integer> repetidosLista = new TreeSet<>();
        
        repetidosLista.addAll(lista20);
        System.out.println("CONJUNTO REPETIDOS DE LA LISTA");
        System.out.println(repetidosLista);
        
        
        Set<Integer> unicos = new TreeSet<>();

        unicos.addAll(sinRepetir);
        unicos.removeAll(repetidosLista);
        System.out.println("CONJUNTO UNICOS DE LA LISTA");
        System.out.println(unicos);
    }
}
