import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorHora, valorMinuto, valorSegundo, n;
        Hora h1 = new Hora();

        do {
            System.out.print("Introduzca el valor de la hora: ");
            valorHora = sc.nextInt();
        } while (valorHora > 24 && valorHora < 0);
        h1.setHoras(valorHora);

        do {
            System.out.print("Introduzca el valor de los minutos: ");
            valorMinuto = sc.nextInt();
        } while (valorMinuto > 59 && valorMinuto < 0);
        h1.setMinutos(valorMinuto);

        do {
            System.out.print("Introduzca el valor de los segundos: ");
            valorSegundo = sc.nextInt();
        } while (valorSegundo > 59 && valorSegundo < 0);
        h1.setSegundos(valorSegundo);

        System.out.print("Los segundos a aumentar (n): ");
        n = sc.nextInt();

        h1.mostrarHora(valorHora, valorMinuto, valorSegundo, n);
    }
}
