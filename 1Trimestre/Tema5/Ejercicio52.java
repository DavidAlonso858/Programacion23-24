import java.util.Scanner;

public class Ejercicio52 {

    public static void mostrarArray(double[] tabla) {
        System.out.println("\nLos numeros introducidos son: ");
        for (double mostrar : tabla) {
            System.out.println(mostrar);
        }

        /*
         * Tambien se podria con sout(Array.toString(tabla))
         */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] tabla = new double[5];

        for (int recorrido = 0; recorrido < tabla.length; recorrido++) {
            System.out.print("Introduce un numero con decimales: ");
            tabla[recorrido] = sc.nextDouble();
        }

        mostrarArray(tabla);
    }
}
