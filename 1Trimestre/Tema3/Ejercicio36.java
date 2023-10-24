import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, contador;

        System.out.print("Introduzca el numero limite de conteo: ");
        num=sc.nextInt();

        for (contador = 1; contador <= num; contador++) {
            System.out.println(contador);
        }

    }
}
