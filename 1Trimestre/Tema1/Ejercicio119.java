import java.util.Scanner;

public class Ejercicio119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entradaInf, entradaAdult;
        double importe, descuento;

        System.out.println("Introduzca el numero de entradas infantiles: ");
        entradaInf = sc.nextInt();

        System.out.println("Introduzca el numero de entradas adultos: ");
        entradaAdult = sc.nextInt();

        importe = (entradaAdult * 20) + (entradaInf * 15.50);

        descuento = importe >= 100 ? importe - (importe * 0.05) : importe;

        System.out.println("El importe total del Bahia Park es: " + descuento);
    }
}
