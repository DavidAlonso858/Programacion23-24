import java.util.Scanner;

public class Repaso27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sabor, chocolate, nata, nombre;
        double costeSabor = 0, costeTotal = 0, costeNata = 0, costeNombre = 0;

        System.out.print("Elije un sabor (manzana, fresa o chocolate): ");
        sabor = sc.next();

        System.out.print("¿Quiere nata? (si o no): ");
        nata = sc.next();

        System.out.print("¿Quieres ponerle un nombre? (si o no): ");
        nombre = sc.next();

        switch (sabor) {
            case "manzana":
                costeSabor = 18.00;
                System.out.println("Tarta de manzana: " + costeSabor);
                break;
            case "fresa":
                costeSabor = 16.00;
                System.out.println("Tarta de fresa: " + costeSabor);
                break;
            case "chocolate":
                System.out.print("¿Que tipo de chocolate quiere? (negro o blanco): ");
                chocolate = sc.next();
                switch (chocolate) {
                    case "negro":
                        costeSabor = 14.00;
                        System.out.println("Tarta de chocolate negro: " + costeSabor);
                        break;
                    case "blanco":
                        costeSabor = 15.00;
                        System.out.println("Tarta de chocolate blanco: " + costeSabor);
                        break;
                    default:
                        System.out.println("Has introducido mal el sabor");
                        break;
                }
        }
        switch (nata) {
            case "si":
                costeNata = 2.50;
                System.out.println("Con nata: " + costeNata);
                break;
        }
        switch (nombre) {
            case "si":
                costeNombre = 2.75;
                System.out.println("Con nombre: " + costeNombre);
                break;
        }
        System.out.println("Total: " + (costeSabor + costeNombre + costeNata));
    }
}
