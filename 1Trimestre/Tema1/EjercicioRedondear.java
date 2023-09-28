import java.util.Scanner;

public class EjercicioRedondear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numDec;
        int redon;
        System.out.println("Introduce un numero con decimales si es tan amable: ");
        numDec = (sc.nextDouble());

        redon = (int) (numDec + 0.5);
        System.out.println(numDec + "  redondeado es: " + redon);
    }
}
