import java.util.Scanner;

public class Repaso29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comida, bebida, pitufo;
        double costeComida = 0, costeBebida = 0;

        System.out.print("¿Que ha tomado de comer? (palmera, donut o pitufo): ");
        comida = sc.next();

        System.out.print("¿Que ha tomado de beber? (zumo o cafe): ");
        bebida = sc.next();

        switch (comida) {
            case "palmera":
                costeComida = 1.40;
                System.out.println("Palmera: " + costeComida);
                break;
            case "donut":
                costeComida = 1.0;
                System.out.println("Donut: " + costeComida);
                break;
            case "pitufo":
                System.out.print("¿Con que se ha tomado el pitufo? (aceita o tortilla): ");
                pitufo = sc.next();
                switch (pitufo) {
                    case "aceite":
                        costeComida = 1.20;
                        System.out.print("Pitufo con aceite: " + costeComida);
                        break;
                    case "tortilla":
                        costeComida = 1.60;
                        System.out.println("Pitufo con tortilla: " + costeComida);
                        break;
                    default:
                        System.out.println("Se ha equivocado con el condimiento");
                        break;
                }
        }
        switch (bebida) {
            case "zumo":
                costeBebida = 1.50;
                System.out.println("Zumo: " + costeBebida);
                break;
            case "cafe":
                costeBebida = 1.20;
                System.out.println("Cafe: " + costeBebida);
                break;
            default:
                System.out.println("Se equivoco de bebida");
                break;
        }
        System.out.println("Total desayuno: " + (costeComida + costeBebida));

    }
}
