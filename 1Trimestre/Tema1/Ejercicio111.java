import java.util.Scanner;

public class Ejercicio111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double iva, baseImponible, total, impIva;

        System.out.println("Introduzca la base imponible: ");
        baseImponible = sc.nextDouble();

        System.out.println("Introduzca el IVA: ");
        iva = sc.nextDouble();
        impIva = iva * 0.21;
        total = baseImponible * iva /100;

        System.out.println("El importe del iva es: " +impIva);
        System.out.println("El importe total es: " +total);
    }
}
