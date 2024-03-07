import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String billIntro;
        Boolean encontrado = false;

        for (BilletesEuro eu : BilletesEuro.values()) {
            System.out.println(eu + "\t su orden es " + eu.ordinal());
        }

        System.out.print("Introduzca un billete (billete_num): ");
        billIntro = sc.nextLine();

        switch (billIntro) {
            case "billete_5" -> System.out.println("Es un billete de 5 euros");
            case "billete_10" -> System.out.println("Es un billete de 10 euros");
            case "billete_20" -> System.out.println("Es un billete de 20 euros");
            case "billete_50" -> System.out.println("Es un billete de 50 euros");
            case "billete_100" -> System.out.println("Es un billete de 100 euros");
            case "billete_200" -> System.out.println("Es un billete de 200 euros, locura");

            default -> System.out.println("No se encuentra en el valor definido");
        }
        for (BilletesEuro eu : BilletesEuro.values()) {
            if (BilletesEuro.valueOf(billIntro).equals(eu)) { // si falla es que no corresponde
                encontrado = true;
            }
        }
        System.out.println("Corresponde con un valor definido: " + encontrado);
    }
}
