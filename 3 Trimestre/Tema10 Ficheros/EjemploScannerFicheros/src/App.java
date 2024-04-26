import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        Scanner sc = new Scanner(System.in); // System in luego cambia dependiendo el flujo de datos

        System.out.print("Introduzca 5 enteros: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
    }
}
