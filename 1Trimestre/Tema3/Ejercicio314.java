import java.util.Scanner;

public class Ejercicio314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabla;
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nLa tabla del "+i);
            for (int j = 1; j <= 10; j++) {
                tabla=j*i;
                System.out.println(i+" * "+j+ " es "+tabla);
            }
        }
    }
}
