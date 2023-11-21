import java.util.Scanner;

public class Ejercicio414 {

    public static int calcularSegundos(int dias, int horas, int minutos) {
        int segundos;

        segundos = (dias * (3600 * 24)) + (horas * 3600) + (minutos * 60);

        return segundos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, dias;

        System.out.print("Introduzca los dias: ");
        dias = sc.nextInt();

        System.out.print("Introduzca las horas: ");
        horas = sc.nextInt();

        System.out.print("Introduzca los minutos: ");
        minutos = sc.nextInt();

        System.out.println("Los segundos totales son: " + calcularSegundos(dias, horas, minutos));
    }

}
