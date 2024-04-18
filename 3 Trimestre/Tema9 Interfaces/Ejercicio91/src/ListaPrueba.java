import java.util.Arrays;

public class ListaPrueba implements Cola {
    private int[] tabla;

    public ListaPrueba() {
        this.tabla = new int[0];
    }

    @Override
    public int desencolar() {
        int aux = tabla[0];
        System.arraycopy(tabla, 1, tabla, 0, tabla.length - 1);
        tabla = Arrays.copyOf(tabla, tabla.length - 1);

        return aux;
    }

    @Override
    public void encolar(int n) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = n;

    }

    @Override
    public String toString() {
        return "ListaPrueba: " + Arrays.toString(tabla);
    }

}
