import java.util.Scanner;

public class FuncionEco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de Eco: ");
        int numero = sc.nextInt();

        eco(numero);
    }

    static void eco(int numPasado) {
        for (int contador = 0; contador < numPasado; contador++) {
            System.out.println("Eco...");
        }
    }
}
