import java.util.Scanner;

public class EjercicioLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double longitud, pi = 3.14159265359 , radio, area;

        System.out.println("Introduce el radio: ");
        radio = sc.nextDouble();

        longitud = 2 * pi * radio;
        area = 3.14 * (radio * radio);

        System.out.println("La longitud de la circunferencia es : " + longitud +
                " Y el area es de: " + area);
    }
}
