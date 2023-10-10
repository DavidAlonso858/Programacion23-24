import java.util.Scanner;

public class Ejercicio116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiempo, segundos, sobra, hora, minutos;

        System.out.println("Introduce el numero de segundos: ");
        tiempo = sc.nextInt();

        hora = tiempo / 3600;
        minutos = tiempo / 60 % 60;
        segundos = tiempo % 60;

        System.out.println("En " + tiempo + " hay: " + hora + " hora, "
                + minutos + " minutos y " + segundos + " segundos");
    }
}
