import java.util.Arrays;
import java.util.List;

public class Lista {
    int Listas[];

    public Lista() {
        Listas = new int[0];
    }

    public int numElementos() {
        return Listas.length;
    }

    public void insertarNumeroPrincipio(int numero) {
        Listas = Arrays.copyOf(Listas, Listas.length + 1);
        System.arraycopy(Listas, 0, Listas, 1, Listas.length - 1); // copia desde un sitio a otro
        Listas[0] = numero;
    }

    public void insertarNumeroFinal(int numero) {
        Listas = Arrays.copyOf(Listas, Listas.length + 1);
        Listas[Listas.length - 1] = numero;
    }

    public void insertarOtraLista(int[] otraLista) {
        int tamIni = Listas.length;
        Listas = Arrays.copyOf(Listas, Listas.length + otraLista.length);
        System.arraycopy(otraLista, 0, Listas, tamIni, otraLista.length); // copia desde un sitio a otro
    }

    public void insertar(int posicion, int numero) {
        Listas = Arrays.copyOf(Listas, Listas.length + 1);
        System.arraycopy(Listas, posicion, Listas, posicion + 1, Listas.length - posicion - 1);
        Listas[posicion] = numero;
    }

    public Integer eliminar(int indice) { // elimina el elemento correspondiente al indice
        Integer eliminado = null;
        if (indice >= 0 && indice < Listas.length) {
            eliminado = Listas[indice];
            for (int i = indice + 1; i < Listas.length; i++) {
                Listas[i - 1] = Listas[i];
            }
            Listas = Arrays.copyOf(Listas, Listas.length - 1);
        }
        return eliminado;
    }

    public Integer get(int indice) {
        Integer resultado = null;
        if (indice >= 0 && indice < Listas.length) {
            resultado = Listas[indice];
        }
        return resultado;
    }

    public void mostrar() {
        System.out.println("Listas: " + Arrays.toString(Listas));
    }
}
