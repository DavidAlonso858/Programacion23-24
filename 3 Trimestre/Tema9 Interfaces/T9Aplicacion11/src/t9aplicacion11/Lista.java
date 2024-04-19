
package t9aplicacion11;

import java.util.Arrays;

/**
 *
 * @author Rocio
 */
public class Lista implements Cola, Pila {

    private String lista[];
    private int numElementos;

    public Lista() {
        lista = new String[0];
        numElementos = 0;
    }

    @Override
    public String desencolar() {
        String aux = lista[0];
        System.arraycopy(lista, 1, lista, 0, lista.length - 1);
        lista = Arrays.copyOf(lista, lista.length - 1);
        return aux;
    }

    @Override
    public void encolar(String n) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length - 1] = n;

    }

    @Override
    public String desenpilar() {
        String aux = lista[lista.length - 1];
        lista = Arrays.copyOf(lista, lista.length - 1);
        return aux;
    }

    @Override
    public void apilar(String n) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length - 1] = n;

    }

    public Lista(int capacidad) {
        lista = new String[capacidad];
        numElementos = 0;
    }

    int getNumeroElementos() {
        return numElementos;
    }

    protected boolean listaLlena() {
        return numElementos == lista.length;
    }

    void insertarPrincipio(String item) {
        if (listaLlena()) {
            lista = Arrays.copyOf(lista, lista.length + 10);
        }

        // Muevo los elementos
        for (int i = numElementos; i > 0; i--) {
            lista[i] = lista[i - 1];
        }
        lista[0] = item;
        numElementos++;
    }

    void insertarFinal(String item) {
        if (listaLlena()) {
            lista = Arrays.copyOf(lista, lista.length + 10);
        }
        lista[numElementos] = item;
        numElementos++;
    }

    void insertarFinal(Lista otraLista) {

        while (numElementos + otraLista.getNumeroElementos() > lista.length) {
            lista = Arrays.copyOf(lista, lista.length + 10);
        }

        // Copio los elementos
        System.arraycopy(otraLista.lista, 0, lista, numElementos, otraLista.getNumeroElementos());
        numElementos += otraLista.getNumeroElementos();
    }

    boolean insertar(int posicion, String nuevo) {
        boolean insertado = true;

        if (posicion < 0 || posicion > getNumeroElementos()) {// índice no válido
            insertado = false;
        } else {
            if (listaLlena()) {
                lista = Arrays.copyOf(lista, lista.length + 10);
            }
            for (int i = numElementos; i > posicion; i--) {
                lista[i] = lista[i - 1];
            }
            lista[posicion] = nuevo;
            numElementos++;
        }
        return insertado;
    }

    String eliminar(int indice) {// si está vacía devuelve null
        String eliminado = null;

        if (indice >= 0 && indice < numElementos) {
            eliminado = lista[indice];
            for (int i = indice; i < numElementos - 1; i++) {
                lista[i] = lista[i + 1];
            }
            numElementos--;
        }
        return eliminado;
    }

    // Si el índice es incorrecto, devuelve null

    String get(int indice) {
        String resultado = null; //
        if (indice >= 0 && indice < numElementos) {// índice válido
            resultado = lista[indice];
        }
        return resultado;
    }

    int buscar(String item) {

        int i = 0;

        while (i < numElementos && lista[i].equals(item)) {
            i++;
        }

        if (i == numElementos) {
            i = -1;
        }

        return i;
    }

    void ordenar() {
        Arrays.sort(lista, 0, numElementos);
    }

    public String toString() {
        String cadena = "";
        for (int i = 0; i < numElementos; i++) {
            cadena += lista[i] + " ";
        }

        return cadena;
    }

}
