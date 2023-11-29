package ArrayEntero;
public class MainArrayEntero {
    public static void main(String[] args) {
        int[] prueba = { 2, 3, 4, 5, 6 };

        ArrayEntero.fill(prueba, 80);
        ArrayEntero.pintarTabla(prueba);
        ArrayEntero.fill(prueba, 1, 4, 22);
        System.out.println();
        ArrayEntero.pintarTabla(prueba, 1, 4);
        System.out.println();
        ArrayEntero.pintarTabla(prueba, 0, 4);
    }
}
