import java.util.Scanner;

public class Refuerzo30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, dia2, hora, hora2, diaDif, horaDif, horaFinal;
        do {
            System.out.println("Por favor, introduzca la primera hora y el dia (1-7): ");
            System.out.print("Dia: ");
            dia = sc.nextInt();
            System.out.print("Hora: ");
            hora = sc.nextInt();

            System.out.println("Por favor, introduzca la segunda hora (1-7): ");
            System.out.print("Dia: ");
            dia2 = sc.nextInt();
            System.out.print("Hora: ");
            hora2 = sc.nextInt();
        } while (dia > 7 || dia < 1 || dia2 > 7 || dia2 < 1 || dia > dia2 || (hora > 24 || hora < 0)
                || (hora2 > 24 || hora2 < 0));

        diaDif = dia - dia2;
        horaDif = diaDif * 24;
        horaFinal = Math.abs(horaDif + (hora - hora2));

        System.out.println("Entre las " + hora + " del " + dia + " y las " + hora2 + " del " + dia2 + " hay "
                + horaFinal + " hora/s");
    }
}
