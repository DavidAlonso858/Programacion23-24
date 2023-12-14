package ArrayEntero;

import java.util.Arrays;

public class MainArrayEntero {
    public static void main(String[] args) {
        int[] prueba = {6, 5, 4, 3, 2, 1 };
        int[] pruebaOrdenada = {1, 2, 3, 4, 5, 84};
        /*
         * ArrayEntero.fill(prueba, 80);
         * ArrayEntero.pintarTabla(prueba);
         * ArrayEntero.fill(prueba, 1, 4, 22);
         * System.out.println();
         * ArrayEntero.pintarTabla(prueba, 1, 4);
         * System.out.println();
         * ArrayEntero.pintarTabla(prueba, 0, 4);
         * System.out.println();
       
         * ArrayEntero.ordenar(prueba);
         * ArrayEntero.insercionDirecta(prueba);
         * 
         * System.out.println(ArrayEntero.busquedaDesordenada(prueba, 3));
         */

         System.out.println(ArrayEntero.busquedaOrdenada(pruebaOrdenada, 5));
    }
}
