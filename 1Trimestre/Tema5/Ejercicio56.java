import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio56 {

    public static int buscarAciertos(int[] tablaPrimitiva, int[] tablaGanadora) {
        int aciertos = 0, busqueda;

        for (int recorrido : tablaPrimitiva) {
            busqueda = Arrays.binarySearch(tablaGanadora, recorrido);
            if (busqueda >= 0) {
                aciertos++;
            }
        }
        return aciertos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablaPrimitiva = { 6, 12, 18, 8, 17, 9 };
        int[] tablaGanadora = { 6, 7, 8, 9, 10, 11 };

        System.out.println("Se han acertado: " + buscarAciertos(tablaPrimitiva, tablaGanadora));
    }
}
