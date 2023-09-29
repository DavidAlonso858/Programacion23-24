import java.util.Scanner;

public class Ejercicio118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hormigas, arañas, cochinillas, patas;

        System.out.println("Introduzca el numero de hormigas: ");
        hormigas = sc.nextInt();

        System.out.println("Introduzca el numero de arañas: ");
        arañas = sc.nextInt();

        System.out.println("Introduzca el numero de cochinillas: ");
        cochinillas = sc.nextInt();

        hormigas *= 6;
        arañas *= 8;
        cochinillas *= 14;

        patas = arañas + hormigas + cochinillas;

        System.out.println("El total de patas de los tres bichos es: " + patas);
    }
}
