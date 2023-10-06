import java.util.Scanner;

public class Ejercicio211Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, unidades, decenas, centenas, miles;
        boolean capicua;

        System.out.println("Introduzca un numero: ");
        num1 = sc.nextInt();

        if (num1 < 0 || num1 > 9999) {
            System.out.println("Introduzca otro numero: ");
            num1 = sc.nextInt();
        } else if (num1 >= 0 && num1 < 10) {
            System.out.println("No es capicua ya que solo tiene una cifra");
        } else if (num1 >= 10 && num1 < 100) {
            decenas = (num1 / 10) % 10;
            unidades = (num1 % 10);
            capicua = decenas == unidades;
            System.out.println("Es capicua: " + capicua);
        } else if (num1 >= 100 && num1 < 1000) {
            centenas = (num1 / 100) % 10;
            unidades = (num1 % 10);
            capicua = centenas == unidades;
            System.out.println("Es capicua: " + capicua);
        } else if (num1 >= 1000 && num1 <= 9999) {
            miles = (num1 / 1000) % 10;
            unidades = (num1 % 10);
            capicua = miles == unidades;
            System.out.println("Es capicua: " + capicua);
        }
    }
}
