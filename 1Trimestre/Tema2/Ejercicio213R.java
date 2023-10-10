import java.util.Scanner;

public class Ejercicio213R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minuto, segundo;

        System.out.println("Introduzca los segundos: ");
        segundo = sc.nextInt();

        System.out.println("Introduzca los minuto: ");
        minuto = sc.nextInt();

        System.out.println("Introduzca las horas: ");
        hora = sc.nextInt();

        if (hora > 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
            segundo++;

            switch (segundo) {
                case 60:
                    segundo = 0;
                    minuto++;
                    break;
            }

            switch (minuto) {
                case 60:
                    minuto = 0;
                    hora++;
                    break;
            }

            switch (hora) {
                case 24:
                    hora = 0;
                    break;
            }

            System.out.println("La hora después de sumar un segundo es: " + hora + ":" + minuto + ":" + segundo);
        } else {
            System.out.println("La hora ingresada no es válida.");
        }
    }
}
