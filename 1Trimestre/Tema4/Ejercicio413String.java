import java.util.Scanner;

public class Ejercicio413String {

    public static String muestraPares(int n) {
        int contador;
        int mostrar = 1;
        String cadena = "";

        System.out.println("Los " + n + " primeros numeros pares son: ");
        for (contador = 0; mostrar <= n; contador += 2) {
            cadena += " - " + contador;
            mostrar++;
        }
        return cadena;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("¿Cuantos pares muestro? ");
        n = sc.nextInt();
        System.out.println(muestraPares(n));
    }

}
