import java.util.Scanner;

public class EjercicioPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        boolean numPar;
        System.out.println("Introduzca un numero si es tan amable: ");
        num = sc.nextDouble();

        numPar = num % 2 == 0;

        System.out.println("Su numero es par: " + numPar);
    }
}
