import java.util.Scanner;

public class Refuerzo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[100];

        tablaCambio(tabla);
    }

    public static int aleatorio() {
        int numero;

        numero = (int) (Math.random() * (20 - 0) + 1);

        return numero;
    }

    public static void tablaCambio(int[] tabla) {
        Scanner sc = new Scanner(System.in);
        int numero1, cambio;
        System.out.println("Los 100 numeros originales: ");

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio();
            System.out.print(tabla[i] + " ");
        }

        System.out.println();
        System.out.print("\nQue valor desea cambiar de los anteriores: ");
        numero1 = sc.nextInt();

        System.out.print("\nIntroduzca el valor nuevo: ");
        cambio = sc.nextInt();

        for (int i : tabla) {
            if (i == numero1) {
                i = cambio;
                System.out.print("''" + i + "'' ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
