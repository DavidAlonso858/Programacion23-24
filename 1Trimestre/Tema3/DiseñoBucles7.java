import java.util.Scanner;

public class DiseñoBucles7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean encontrado = false;

        do {
            System.out.print("Introduzca un numerin: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                encontrado = true;
            }

        } while (!encontrado);

        System.out.println("Al fin lo encuentras jeje");
    }
}
