import java.util.Arrays;

public class Pila extends Lista {
    private Lista l1;

    public Pila() {
        l1 = new Lista();
    }

    public void apilar(int elemento) {
        l1.insertarFinal(elemento);
        // pila = Arrays.copyOf(pila, pila.lenght+1)
        // pila[pila.lenght-1]=elemento

    }

    public int desapilar() {
        int aux = l1.tabla[l1.tabla.length - 1];
        l1.tabla = Arrays.copyOf(l1.tabla, l1.tabla.length - 1);
        return aux;
    }

    @Override
    public String toString() {
        return l1.toString();
    }
}
