import java.util.Scanner;

public class Repaso8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        int m;
        String boletin;

        System.out.print("Introduzca su primera nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Introduzca su segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("Introduzca su tercera nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3.0;
        m = (int) (media +0.5);
        if (m >= 0) {
            switch (m) {
                case 0, 1, 2, 3, 4 -> boletin = "Insuficiente";
                case 5 -> boletin = "Suficiente";
                case 6 -> boletin = "Bien";
                case 7, 8 -> boletin = "Notable";
                case 9, 10 -> boletin = "Sobresaliente";
                default -> boletin = "Te vamos a ascender de curso";
            }
            System.out.println("\nSu nota media es de: " + media + " , " + boletin);
        } else
            System.out.println("\nSu nota es demasiado baja, te aconsejo hacer otro curso");

    }
}
