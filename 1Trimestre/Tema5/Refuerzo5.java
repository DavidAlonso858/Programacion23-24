import java.util.Scanner;

//Introducir 10 numeros y decir maximo y minimo de esos ademas de mostrarlos
public class Refuerzo5 {

    public static void mostrar(int[] tabla) {
        int minimo = Integer.MAX_VALUE, maximo = Integer.MIN_VALUE;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > maximo) {
                maximo = tabla[i];
            }
            if (tabla[i] < minimo) {
                minimo = tabla[i];
            }
            System.out.print(tabla[i] + " ");
        }

        System.out.println("\nEl minimo es: " + minimo);
        System.out.println("El maximo es: " + maximo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];

        for (int recorrido = 0; recorrido < tabla.length; recorrido++) {
            System.out.print("Introduzca un numerin: ");
            tabla[recorrido] = sc.nextInt();
        }
        mostrar(tabla);
    }

}
