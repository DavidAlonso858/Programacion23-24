import java.util.Scanner;

public class Ejercicio413 {

    public static int muestraPares(int n) {
        int contador;
        int mostrar = 1;

        System.out.println("Los " + n + " primeros numeros pares son: ");
        for (contador = 0; mostrar < n; contador += 2) {
            System.out.println(contador);
            mostrar++;
        }
        return contador;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("¿Cuantos pares muestro? ");
        n = sc.nextInt();
        System.out.println(muestraPares(n));
    }

}
