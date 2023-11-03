import java.util.Scanner;

public class Ejercicio320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinBanco = 0, dinHucha = 0, dinCajon = 0, dinBolsillo = 0, suma = 0;

        System.out.println("Si quieres parar de introducir cantidades ponga un 0");
        do {

            System.out.print("Introduce la cantidad de dinero en el banco: ");
            dinBanco = sc.nextDouble();
            suma += dinBanco;
            if (dinBanco != 0) {
                System.out.print("Introduce la cantidad de dinero en la hucha: ");
                dinHucha = sc.nextDouble();
                suma += dinHucha;
            }
            if (dinHucha != 0) {
                System.out.print("Introduce la cantidad de dinero en el cajon: ");
                dinCajon = sc.nextDouble();
                suma += dinCajon;
            }
            if (dinCajon != 0) {
                System.out.print("Introduce la cantidad de dinero en el bolsillo: ");
                dinBolsillo = sc.nextDouble();
                suma += dinBolsillo;
            }

        } while (dinBanco < 0 || dinBolsillo < 0 || dinCajon < 0 || dinHucha < 0);

        System.out.println("La suma total es: " + suma);

    }
}
