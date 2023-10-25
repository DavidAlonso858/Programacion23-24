import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, veces, suma = 0, media;

        for (veces = 0; veces < 10; veces++) {
            System.out.print("Introduzca un numero: ");
            num = sc.nextInt();
            suma += num;
        }
        media = suma / 10;
        System.out.println("La media es: " + media);
    }
}
