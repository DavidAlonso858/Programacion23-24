import java.util.Locale;
import java.util.Scanner;

public class Repaso3 {
    public static void main(String[] args) {
        double precio, precioFinal;
        final double DESCUENTO = 1.87;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce el precio de la entrada: ");
        precio = sc.nextDouble();

        precioFinal = precio - DESCUENTO;
        System.out.println("El precio final es " + precioFinal);

        System.out.println("El programa aplica un descuento fijo al precio de la entrada introducido");
    }
}
