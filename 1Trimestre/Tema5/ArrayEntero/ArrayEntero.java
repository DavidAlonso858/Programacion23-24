package ArrayEntero;
public class ArrayEntero {

    public static void pintarTabla(int[] tabla) {
        for (int valor : tabla) {

            System.out.println(valor);
        }
    }

    public static void pintarTabla(int[] tabla, int desde, int hasta) {
         for (int i = desde; i <= hasta; i++) {
            System.out.println(tabla[i]);    
            
        }
    }

    public static void fill(int[] tabla, int valor) {

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = valor;
        }

    }

    public static void fill(int[] tabla, int desde, int hasta, int valor) {

        for (int i = desde; i <= hasta; i++) {
            tabla[i] = valor;
        }
    }
}
