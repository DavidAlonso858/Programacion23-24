import java.util.Scanner;

public class EjercicioDNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, letra = 0;

        System.out.println("Introduce el numero de 8 cifras de tu dni: ");
        num = sc.nextInt();

        if (num > 99999999 || num<10000000) {
            System.out.println("Te has equivocado, introduce el numero de 8 cifras de tu dni: ");
            num = sc.nextInt();
        } else {
            letra = num % 22;
        }

        switch (letra) {
            case 0 -> System.out.println("Tu DNI es: " + num + " T");
            case 1 -> System.out.println("Tu DNI es: " + num + " R");
            case 2 -> System.out.println("Tu DNI es: " + num + " W");
            case 3 -> System.out.println("Tu DNI es: " + num + " A");
            case 4 -> System.out.println("Tu DNI es: " + num + " G");
            case 5 -> System.out.println("Tu DNI es: " + num + " M");
            case 6 -> System.out.println("Tu DNI es: " + num + " Y");
            case 7 -> System.out.println("Tu DNI es: " + num + " F");
            case 8 -> System.out.println("Tu DNI es: " + num + " P");
            case 9 -> System.out.println("Tu DNI es: " + num + " D");
            case 10 -> System.out.println("Tu DNI es: " + num + " X");
            case 11 -> System.out.println("Tu DNI es: " + num + " B");
            case 12 -> System.out.println("Tu DNI es: " + num + " N");
            case 13 -> System.out.println("Tu DNI es: " + num + " J");
            case 14 -> System.out.println("Tu DNI es: " + num + " Z");
            case 15 -> System.out.println("Tu DNI es: " + num + " S");
            case 16 -> System.out.println("Tu DNI es: " + num + " Q");
            case 17 -> System.out.println("Tu DNI es: " + num + " V");
            case 18 -> System.out.println("Tu DNI es: " + num + " H");
            case 19 -> System.out.println("Tu DNI es: " + num + " L");
            case 20 -> System.out.println("Tu DNI es: " + num + " C");
            case 21 -> System.out.println("Tu DNI es: " + num + " K");
            case 22 -> System.out.println("Tu DNI es: " + num + " E");

        }
    }
}
