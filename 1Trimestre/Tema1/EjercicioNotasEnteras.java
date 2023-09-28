import java.util.Scanner;

public class EjercicioNotasEnteras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  media;
        double mediaDec, nota1, nota2, nota3;
        System.out.println("Introduce la primera nota: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Introduce la segunda nota: ");
        nota2 = sc.nextDouble();
        
        System.out.println("Introduce la tercera nota: ");
        nota3 = sc.nextDouble();

        mediaDec = (nota1 + nota2 + nota3) / 3; 
        media = (int) mediaDec;
        System.out.println("La media entera: " +media);
        System.out.println("La media con decimales: " +mediaDec);
    }
}
