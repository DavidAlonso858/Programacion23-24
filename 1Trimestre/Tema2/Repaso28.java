import java.util.Scanner;

public class Repaso28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jugador1, jugador2;

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        jugador1 = sc.next();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        jugador2 = sc.next();

        switch (jugador1) {
            case "piedra":
                if (jugador2.equals("papel")) {
                    System.out.println("Gana el jugador 2");
                } else if (jugador2.equals("tijera")) {
                    System.out.println("Gana el jugador 1");
                } else if (jugador2 == "piedra") {
                    System.out.println("Empate");
                }
                break;
            case "papel":
                if (jugador2.equals("papel")) {
                    System.out.println("Empate");
                } else if (jugador2.equals("tijera")) {
                    System.out.println("Gana el jugador 2");
                } else if (jugador2.equals("piedra")) {
                    System.out.println("Gana el jugador 1");
                }
                break;
            case "tijera":
                if (jugador2.equals("papel")) {
                    System.out.println("Gana el jugador 1");
                } else if (jugador2.equals("tijera")) {
                    System.out.println("Empate");
                } else if (jugador2.equals("piedra")) {
                    System.out.println("Gana el jugador 2");
                }
                break;
            default:
                System.out.println("error");
                break;

        }
    }
}
