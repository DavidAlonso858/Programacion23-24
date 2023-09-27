import java.util.Scanner;

public class EjercicioMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2;
        double media;
        System.out.print("Introduce tu primera nota: ");
        nota1 = sc.nextInt();
        System.out.print("Introduce tu segunda nota: ");
        nota2 = sc.nextInt();

        media = (nota1 + nota2) / 2.0;
        System.out.println("La media de sus notas será de: " +media);

    }
}
