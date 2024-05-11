import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sorteo<T extends Comparable<T>> {
    private Set<T> conjuntoSorteo;

    public Sorteo() {
        conjuntoSorteo = new TreeSet<>();
    }

    public boolean add(T elemento) {
        return conjuntoSorteo.add(elemento);
    }

    public Set<T> premiados(int numPremiados) {
        Set<T> premiado = new TreeSet<>();

        List<T> usarLista = new LinkedList<>(conjuntoSorteo);
        Collections.shuffle(usarLista);

        if (numPremiados <= conjuntoSorteo.size()) {
            for (int i = 0; i < numPremiados; i++) {
                premiado.add(usarLista.get(i));
            }
        }
        return premiado;
    }

    @Override
    public String toString() {
        return "Sorteo [conjuntoSorteo-> " + conjuntoSorteo + "]";
    }

}
