import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, tabla;

        do {
            System.out.print("Introduzca un numero entre 1 y 10: ");
            num=sc.nextInt();
        } while (!(num>=1 && num<=10));

        for (int i = 1; i <= 10; i++) {
            tabla = num * i;
            System.out.println("El "+num+" * "+i+" es "+tabla);
        }
    }
}
