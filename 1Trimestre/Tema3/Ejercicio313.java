import java.util.Scanner;

public class Ejercicio313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, suspensos = 0, condicionados = 0, aprobados = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Intorduzca la nota: ");
            nota = sc.nextInt();
            if (nota < 4) {
                suspensos++;
            } else if (nota == 4) {
                condicionados++;
            } else
                aprobados++;
        }
        System.out.println("El numero de suspensos es: " + suspensos);
        System.out.println("El numero de condicionados es: " + condicionados);
        System.out.println("El numero de aprobados es: " + aprobados);
    }
}