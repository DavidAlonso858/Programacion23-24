package refuerzo18;

import java.util.List;

public class Pila<T> {

    private List<T> listaGenerica2;

    public Pila(List<T> listaGenerica2) {
        this.listaGenerica2 = listaGenerica2;
    }

    public void guardar(T nuevo) {
        listaGenerica2.add(nuevo);
    }

    public T quitar() {
        T extraer = null;

        if (listaGenerica2.size() < 0) {
            System.out.println("La lista esta vacia");
        } else {
            extraer = listaGenerica2.remove(listaGenerica2.size() - 1);

        }

        return extraer;
    }

    @Override
    public String toString() {
        return "Pila{" + "listaGenerica2-> " + listaGenerica2 + '}';
    }
}
