import java.util.Scanner;

public class Ejercicio216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, ter;

        System.out.println("Introduzca un numero: ");
        num=sc.nextInt();

        ter=num<0 ? (-1*num):num;

        System.out.println("El valor absoluto de ese numero es: "+ter);


    }
}
