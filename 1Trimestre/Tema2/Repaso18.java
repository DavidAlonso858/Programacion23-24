import java.util.Scanner;

public class Repaso18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, unidad, decena, centena, miles, miles2, primeraCifra = 0;
        String cifra = "null";

        System.out.println("Introduzca un numerin menor de 6 cifras: ");
        num = sc.nextInt();

        if (num > 99999) {
            System.out.println("He dicho un numero de 5 cifras al menos: ");
            num = sc.nextInt();
        }
        if (num < 10) {
            primeraCifra = num;
        }
        if (num >= 10 && num <= 99) {
            primeraCifra = num / 10;
        }
        if (num >= 100 && num <= 999) {
            primeraCifra = num / 100;
        }
        if (num >= 1000 && num <= 9999) {
            primeraCifra = num / 1000;
        }
        if (num >= 10000 && num <= 99999) {
            primeraCifra = num / 10000;
        }
        switch (primeraCifra) {
            case 1 -> cifra = "uno";
            case 2 -> cifra = "dos";
            case 3 -> cifra = "tres";
            case 4 -> cifra = "cuatro";
            case 5 -> cifra = "cinco";
            case 6 -> cifra = "seis";
            case 7 -> cifra = "siete";
            case 8 -> cifra = "ocho";
            case 9 -> cifra = "nueve";
            default -> cifra = "-";
        }
        System.out.println("La primera cifra de " + num + " es " + cifra);
    }
}
