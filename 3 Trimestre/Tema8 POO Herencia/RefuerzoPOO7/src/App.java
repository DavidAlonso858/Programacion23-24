import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcion, opcionCompra, n;

        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        do {
            System.out.println("\n1. Mostrar numero de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");

            System.out.print("\nIntroduce la opcion que quieres: ");
            opcion = sc.nextByte();

            switch (opcion) {
                case 1:
                    System.out.println("En la zona principal hay: " + principal.getEntradasPorVender());
                    System.out.println("En la zona compra/venta hay: " + compraVenta.getEntradasPorVender());
                    System.out.println("En la zona vip hay: " + vip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.println("\n4. Principal");
                    System.out.println("5. Compra-venta");
                    System.out.println("6. Vip");
                    System.out.print("\nEn que zona quieres las entradas: ");
                    opcionCompra = sc.nextByte();

                    System.out.print("¿Cuantas entradas quieres? ");
                    n = sc.nextByte();
                    switch (opcionCompra) {
                        case 4:
                            principal.vender(n);
                            break;
                        case 5:
                            compraVenta.vender(n);
                            break;
                        case 6:
                            vip.vender(n);
                            break;

                    }
                    break;
                case 3:
                    System.out.println("Espero que haya ido todo bien. Vuelve cuando quieras");
                    break;
            }
        } while (opcion < 3);
    }
}
