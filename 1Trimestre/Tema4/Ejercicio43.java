import java.util.Scanner;

public class Ejercicio43 {
    public static double Volumen(double altura, double radio) {
        double volumen;

        volumen = (Math.PI * (radio * radio) * altura);

        return volumen;
    }

    public static double Area(double altura, double radio) {
        double area;

        area = ((2 * Math.PI) * (altura + radio));

        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, altura;
        int eleccion;

        System.out.print("Introduzca el radio: ");
        radio = sc.nextDouble();

        System.out.print("Introduzca la altura: ");
        altura = sc.nextDouble();

        System.out.print("Introduzca 1 para calcular el area o 2 para el volumen: ");
        eleccion = sc.nextInt();

        switch (eleccion) {
            case 1 -> System.out.println("El area es: " + Area(altura, radio));
            case 2 -> System.out.println("El volumen es: " + Volumen(altura, radio));
            default -> System.out.println("Has elegido mal");
        }
    }

}
