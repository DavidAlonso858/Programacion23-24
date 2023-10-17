import java.util.Scanner;

public class Repaso6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t, h;

        System.out.println("Introduzca la altura en metros: ");
        h=sc.nextDouble();
        
        t= Math.sqrt(2*h/9.81);

        System.out.printf("El tiempo que tardara desde esa altura es: %.4f m/s", t);
    }
}
