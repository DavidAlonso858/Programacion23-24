import java.util.Scanner;

public class EjercicioValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, valorAb;
        
        System.out.print("Ingrese un número: ");
        num = sc.nextDouble();

        valorAb = (num < 0) ? -num : num;

        System.out.println("El valor absoluto de " + num + " es " + valorAb);
    }
}
