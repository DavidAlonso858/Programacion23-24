import java.util.Scanner;

public class Refuerzo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0, media = 0, numIntro = 0;

        do {
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();

            suma += numero;
            numIntro++;
        } while (numero < 0 || suma < 10000);

        media = suma / numIntro;

        System.out.println("El total de numeros introducidos es: " + numIntro);
        System.out.println("El total de la suma es: " + suma);
        System.out.println("La media es : " + media);

    }

}
