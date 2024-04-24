import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Supercola sp = new Supercola();
        int opcion, n;

        do {
            System.out.println("\n1. Encolar en cola1. ");
            System.out.println("2. Encolar en cola2. ");
            System.out.println("3. Desencolar en cola1. ");
            System.out.println("4. Desencolar en cola2. ");
            System.out.println("5. Salir. ");
            System.out.print("\nIntroduzca la opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el numero a encolar: ");
                    n = sc.nextInt();
                    sp.encolar(n);
                    System.out.println(sp);
                    break;
                case 2:
                    System.out.print("Introduzca el numero a encolar: ");
                    n = sc.nextInt();
                    sp.encolar2(n);
                    System.out.println(sp);
                    break;
                case 3:
                    sp.comprobar();
                    System.out.println(sp);
                    break;
                case 4:
                    sp.comprobar2();
                    System.out.println(sp);
                    break;

                default:
                    System.out.println("Te has equivocadooo al elegir");
                    break;
            }
        } while (opcion != 5);
    }
}
