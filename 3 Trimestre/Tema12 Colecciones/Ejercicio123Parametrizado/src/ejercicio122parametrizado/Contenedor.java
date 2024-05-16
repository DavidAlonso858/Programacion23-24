package ejercicio122parametrizado;

import java.util.Arrays;

public class Contenedor<T extends Comparable<T>> {

    private T[] tablaObjetos; // tabla T no se puede inicializar new T[0]

    public Contenedor(T[] tablaObjetos) {
        this.tablaObjetos = tablaObjetos;
    }

    public void insertarAlPrincipio(T nuevo) {
        
    }

    @Override
    public String toString() {
        return "Contenedor{" + "tablaObjetos-> " + Arrays.toString(tablaObjetos) + '}';
    }
}
