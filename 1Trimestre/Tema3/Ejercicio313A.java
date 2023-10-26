import java.util.Scanner;

public class Ejercicio313A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minutos, seg, seg2;

        do {

            System.out.print("Introduce la hora: ");
            hora = sc.nextInt();

            System.out.print("Introduce los minutos: ");
            minutos = sc.nextInt();

            System.out.print("Introduce los segundos: ");
            seg = sc.nextInt();

            System.out.print("¿Cuantos segundos quiere incrementar?: ");
            seg2 = sc.nextInt();

        } while (hora >= 24 || minutos >= 60 || seg >= 60);

        seg += seg2;
        if (seg >= 60) {
            minutos += seg / 60;
            seg = seg % 60;
            if (minutos >= 60) {
                hora += minutos / 60;
                minutos = minutos % 60;
            }
        }
        System.out.println("La hora es: " + hora + " : " + minutos + " : " + seg);
    }
}
