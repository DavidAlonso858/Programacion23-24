import java.util.Scanner;

public class FuncionEco {
    public static int eco(int numPasado) {
        int contadorEcos = 0;
        for (int contador = 0; contador < numPasado; contador++) {
            System.out.println("Eco...");
            contadorEcos--;
        }
        return contadorEcos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de Eco: ");
        int numero = sc.nextInt();

        int contador = eco(numero);
        System.out.println("El numero de ecos es: " + contador);
    }

}
