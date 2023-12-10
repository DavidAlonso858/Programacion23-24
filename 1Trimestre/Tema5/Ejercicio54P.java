import java.util.Scanner;

public class Ejercicio54P {

    public static int buscar(int t[], int clave) {
        int posicion = 0;

        for (int i : t) {
            if (i == clave) {
                return posicion;
            }
            posicion++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave = 8;

        int[] tabla = { 2, 3, 4, 8 };

        System.out.println("La posicion de la clave es: " + buscar(tabla, clave));
    }
}
