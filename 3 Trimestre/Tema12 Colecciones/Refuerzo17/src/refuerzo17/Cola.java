package refuerzo17;

import java.util.List;

public class Cola<T> {

    private List<T> listaGenerica;

    public Cola(List<T> listaGenerica) {
        this.listaGenerica = listaGenerica;
    }

    public void guardar(T nuevo) {
        listaGenerica.add(nuevo);
        // se añade directamente al final
    }

    public T quitar() {
        T extraer = null;

        if (listaGenerica.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            extraer = listaGenerica.remove(0);
            // al ser cola se quita el primero
        }

        return extraer;
    }

    @Override
    public String toString() {
        return "Cola{" + "listaGenerica-> " + listaGenerica + '}';
    }
}
