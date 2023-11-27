import java.util.Scanner;

public class Refuerzo18 {
    
    public static String decimalBinario(int decimal) {
        int digito;
        String binario = "";

        for (; decimal > 0; decimal /= 2) {
            digito = decimal % 2;
            binario = digito + binario;
        }
        return binario;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal;

        do {
            System.out.println("Introduzca un numero: ");
            decimal = sc.nextInt();
        } while (decimal < 0);

        System.out.println("El binario de " + decimal + " es " + decimalBinario(decimal));
    }

}
