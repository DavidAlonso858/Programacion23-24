import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplo;

        System.out.println("Los multiplos de 7 menores que 100 son: ");

        for (multiplo = 0; multiplo < 100; multiplo += 7) {
            System.out.println(multiplo);
        }
    }
}
