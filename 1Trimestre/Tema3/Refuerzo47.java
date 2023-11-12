import java.util.Scanner;

public class Refuerzo47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFilas, altura;

        System.out.print("Por favor, introduzca la altura (numero impar mayor o igual a 5): ");
        numFilas = sc.nextInt();

        if (numFilas % 2 == 0 || numFilas < 5) {
            System.out.println("La altura introducida no es correcta");
        } else {
            System.out.println("MMMMMM");

            altura = (numFilas - 3) / 2;

            for (int mitad1 = 0; mitad1 < altura; mitad1++) {
                System.out.println("M    M");
            }

            System.out.println("MMMMMM");

            for (int mitad2 = 0; mitad2 < altura; mitad2++) {
                System.out.println("M    M");
            }

            System.out.println("MMMMMM");

        }

    }
}
