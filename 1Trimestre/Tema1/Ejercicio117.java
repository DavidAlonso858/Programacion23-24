import java.util.Scanner;

public class Ejercicio117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int milimetros, centimetros, metros, m, suma, ml;

        System.out.println("Introduce la cantidad de milimetros: ");
        milimetros = sc.nextInt();

        System.out.println("Introduce la cantidad de centimetros: ");
        centimetros = sc.nextInt();

        System.out.println("Introduce la cantidad de metros: ");
        metros = sc.nextInt();

        m = metros * 100;
        ml = milimetros / 1000;
        suma = m + ml + centimetros;

        System.out.println("La cantidad total en centimetros es de: " + suma);
    }
}
