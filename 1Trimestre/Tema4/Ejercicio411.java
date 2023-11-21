import java.util.Scanner;

public class Ejercicio411 {

    public static double superficieEsfera(double radioPasado) {
        double superficie;

        superficie = (4 * Math.PI) * (Math.pow(radioPasado, 2));

        return superficie;
    }

    public static double volumenEsfera(double radioPasado) {
        double volumen;

        volumen = (4 * Math.PI) / 3 * (Math.pow(radioPasado, 3));

        return volumen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;

        do {
            System.out.print("Introduzca el radio de la esfera: ");
            radio = sc.nextDouble();
        } while (radio <= 0);

        System.out.printf("El volumen de la esfera es: %.4f", volumenEsfera(radio));
        System.out.printf("\nLa superficie de la esfera es: %.4f", superficieEsfera(radio));
    }
}
