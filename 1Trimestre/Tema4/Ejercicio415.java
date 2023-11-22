import java.util.Scanner;

public class Ejercicio415 {
    
    public static int diferenciaMin(int hora1, int hora2, int minuto1, int minuto2) {
        int horaDif, minutoDif, totalDif;

        horaDif = Math.abs(hora1 - hora2);
        horaDif *= 60;
        minutoDif = Math.abs(minuto1 - minuto2);
        totalDif = horaDif + minutoDif;

        return totalDif;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora1 = 12, hora2 = 14, minuto1 = 30, minuto2 = 45;

        System.out.println("La diferencia total en minutos es: " + diferenciaMin(hora1, hora2, minuto1, minuto2));
    }

}
