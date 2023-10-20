import java.util.Scanner;

public class Repaso21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        String recu;

        System.out.print("Nota del primer control: ");
        nota1 = sc.nextDouble();

        System.out.print("Nota del segundo control: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2.0;

        if (media >= 5) {
            System.out.println("Tu nota de Programacion es: " + media);
        } else {
            System.out.print("Cual ha sido el resultado de la recuperacion? (apto/no apto): ");
            recu = sc.next();

            switch (recu) {
                case "apto" -> System.out.println("Tu nota de Programacion es 5");
                case "no" -> System.out.println("Tu nota de Programacion es " + media);
            }
        }
    }
}
