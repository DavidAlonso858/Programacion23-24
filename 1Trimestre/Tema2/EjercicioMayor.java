import java.util.Scanner;

public class EjercicioMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

         
        System.out.println("Introduzca el primer numerin: ");
        num1=sc.nextInt();

        System.out.println("Introduzca el segundo numerin: ");
        num2=sc.nextInt();

        if (num1>num2) {
            System.out.println(num1+ " es mayor que " +num2);
        } else {
            System.out.println(num2+ " es mayor que " +num1);
        }
    }
}
