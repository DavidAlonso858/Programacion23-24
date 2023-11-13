import java.util.Scanner;

public class DiseñoBucles6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carrera, andar, bicicleta;
        boolean deporte;
        char respuesta;

        do {
            System.out.print("Cuantos km has corrido esta semana: ");
            carrera = sc.nextInt();

            System.out.print("Cuantos km has andado esta semana: ");
            andar = sc.nextInt();

            System.out.print("Cuantos km has rodado esta semana: ");
            bicicleta = sc.nextInt();
        } while (carrera > 50 || andar >= 10 && bicicleta >= 100);

        do {
            System.out.print("Has practicado algun deporte esta semana: (s/n) ");
            respuesta = sc.next().charAt(0);

            switch (respuesta) {
                case 's' -> deporte = true;
                case 'n' -> deporte = false;
                default -> deporte = false;
            }
        } while (!deporte);

        do {
            System.out.print("Cuantos km has corrido esta semana: ");
            carrera = sc.nextInt();

            System.out.print("Cuantos km has andado esta semana: ");
            andar = sc.nextInt();

            System.out.print("Cuantos km has rodado esta semana: ");
            bicicleta = sc.nextInt();
        } while ((carrera >= 20 && bicicleta >= 50) || (andar >= 40 && bicicleta >= 60));
    }
}
