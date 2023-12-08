import java.util.Scanner;

public class Ejercicio54 {

    public static int maximo(int[] tabla) {
        int maximo = Integer.MIN_VALUE;
        for (int recorrido : tabla) {
            if (recorrido > maximo) {
                maximo = recorrido;
            }
        }
        return maximo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = { 3, 4, 5, 8, 12 };

        System.out.println("El valor maximo de la tabla es: " + maximo(tabla));
    }

}
