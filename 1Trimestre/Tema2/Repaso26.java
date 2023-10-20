import java.util.Scanner;

public class Repaso26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioBase = 0, descuento = 0, total;
        int entradas;
        String dia, tarjeta;

        System.out.println("Venta de entradas CineCampa");

        System.out.print("Numero de entradas: ");
        entradas = sc.nextInt();

        System.out.print("Dia de la semana: ");
        dia = sc.next();

        System.out.print("¿Tienes tarjeta CineCampa? (s/n): ");
        tarjeta = sc.next();

        System.out.println("Aqui tienes sus entrad. Gracias por su compra");

        if (dia.equals("miercoles")) {
            precioBase = 5;
            System.out.println("Precio por entrada: " + precioBase);
        }
        if (dia.equals("jueves")) {
            if (entradas % 2 == 0)
                precioBase = 5.5;
            System.out.println("Precio por entrada: " + precioBase);

        } else {
            precioBase = 8;
            System.out.println("Precio por entrada: " + precioBase);
        }
        total = precioBase * entradas;
        System.out.println("Total " + total);

        switch (tarjeta) {
            case "s":
                descuento = precioBase * entradas * 0.10;
                break;
        }
        System.out.println("Descuento " + descuento);
        System.out.println("A pagar " + (total - descuento));
    }
}
