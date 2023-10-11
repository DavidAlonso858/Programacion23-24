import java.util.Scanner;

public class Ejercicio217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, ale1, ale2, resultado;

        ale1 = (int) (Math.random() * (99 - 1)) + 1;
        ale2 = (int) (Math.random() * (99 - 1)) + 1;

        System.out.println(ale1 + " + " + ale2);
        resultado = ale1 + ale2;
        System.out.print("¿Cual es el resultado de esa suma?: ");
        sum = sc.nextInt();

        if (resultado == sum) {
            System.out.println("\nHas acertado, eres un genio");
        } else {
            System.out.println("\nMe temo que has fallado");
        }
    }
}
