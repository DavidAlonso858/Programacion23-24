import java.util.Scanner;

public class Repaso25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;
        double total, total2, escudoPrecio=0, gastoEnvio=3.25;
        String escudo;

        System.out.print("Introduzca la altura de la bandera en cm: ");
        altura = sc.nextInt();

        System.out.print("Ahora introduzca la anchura: ");
        anchura = sc.nextInt();

        System.out.print("¿Quiere escudo bordado? (s/n): ");
        escudo = sc.next();

        System.out.println("Gracias. Aqui tiene el desglose de su compra.");
        total = altura * anchura;
        total2=total/100;

        System.out.println("Bandera de " + total + "cm2: " + (total2));
        switch (escudo) {
            case "s":
                escudoPrecio = 2.50;
                System.out.println("Con escudo: " + escudoPrecio);
                break;
            case "n":
                escudoPrecio = 0.00;
                System.out.println("Sin escudo: " + escudoPrecio);
                break;
            default:
                System.out.println("Te has equivocado al seleccionar la opcion");
                break;
        }
        System.out.println("Gastos de envio: "+gastoEnvio);

        System.out.println("Total: "+(total2+gastoEnvio+escudoPrecio));

    }
}
