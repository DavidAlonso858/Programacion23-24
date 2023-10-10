import java.util.Scanner;

public class Ejercicio215P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aforoMax, venEntrada;
        double precio, recaudacion = 0;

        System.out.println("Introduce el precio de las entradas: ");
        precio = sc.nextDouble();

        System.out.println("Introduce el aforo maximo: ");
        aforoMax = sc.nextInt();

        System.out.println("Introduzca el numero de entradas vendidas: ");
        venEntrada = sc.nextInt();

        if (venEntrada < aforoMax * 0.20) {
            System.out.println("Se cancela el concierto");

        } else if (venEntrada < aforoMax * 0.50) {
            recaudacion = venEntrada * (precio * 0.75);
            System.out.println("La recaudacion total es: " + recaudacion+ " euros ");
        } else
            System.out.println("La recaudacion total es: " + venEntrada * precio + " euros ");
    }
}
