import java.util.Arrays;

public class Cola {
    private Lista l1;

    public Cola() {
        l1 = new Lista();
    }

    public void encolar(int elemento) {
        l1.insertarFinal(elemento);
    }

    public int desencolar() {
        int aux = l1.tabla[0];
        System.arraycopy(l1.tabla, 1, l1.tabla, 0, l1.tabla.length - 1);
        /*
         * lo mismo que:
         * for(i=1; i<cola.lenght; i++){
         * cola[i-1]=cola[i];
         * }
         */
        l1.tabla = Arrays.copyOf(l1.tabla, l1.tabla.length - 1);

        return aux;
    }

    @Override
    public String toString() {
        return l1.toString();
    }
}
