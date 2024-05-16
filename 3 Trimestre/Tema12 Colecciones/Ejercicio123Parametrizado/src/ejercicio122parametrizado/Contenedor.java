package ejercicio122parametrizado;

import java.util.Arrays;

public class Contenedor<T extends Comparable<T>> {

    private T[] tablaObjetos; // tabla T no se puede inicializar new T[0]

    public Contenedor(T[] tablaObjetos) {
        this.tablaObjetos = tablaObjetos;
    }

    public void insertarAlPrincipio(T nuevo) {
        tablaObjetos = Arrays.copyOf(tablaObjetos, tablaObjetos.length + 1);
        System.arraycopy(tablaObjetos, 0, tablaObjetos, 1, tablaObjetos.length - 1); // al sumarle uno le pasamos todo para dejar el primero vacio

        tablaObjetos[0] = nuevo;
    }

    public void insertarAlFinal(T nuevo) {
        tablaObjetos = Arrays.copyOf(tablaObjetos, tablaObjetos.length + 1);

        tablaObjetos[tablaObjetos.length - 1] = nuevo;
    }

    public T extraerDelPrincipio() {
        T extraer = null;

        if (tablaObjetos.length < 0) {
            System.out.println("Esta vacia la tabla");
        } else {
            extraer = tablaObjetos[0];
            System.arraycopy(tablaObjetos, 1, tablaObjetos, 0, tablaObjetos.length - 1);
            tablaObjetos = Arrays.copyOf(tablaObjetos, tablaObjetos.length - 1);
        }
        return extraer;
    }

    public T extraerDelFinal() {
        T extraer = null;

        if (tablaObjetos.length < 0) {
            System.out.println("Esta vacia la tabla");
        } else {
            extraer = tablaObjetos[tablaObjetos.length - 1];
            tablaObjetos = Arrays.copyOf(tablaObjetos, tablaObjetos.length - 1);
        }
        return extraer;
    }

    public void ordenar() {
        Arrays.sort(tablaObjetos);
    }

    @Override
    public String toString() {
        return "Contenedor{" + "tablaObjetos-> " + Arrays.toString(tablaObjetos) + '}';
    }
}
