import java.util.Scanner;

public class Ejercicio219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grados;
        double radiales;

        System.out.println("Introduzca los grados del angulo: ");
        grados = sc.nextInt();

        if (grados < 0 || grados > 360) {
            grados %= 360;
        }
        radiales = grados * (Math.PI / 180);
        System.out.println(grados + " grados son " + radiales + " radiales");
    }
}
