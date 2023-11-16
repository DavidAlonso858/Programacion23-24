import java.util.Scanner;

public class EjemploLongitud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, long;

        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();
        
        longitud;
        System.out.println("La longitud de ese numero es: " + longitud);
    }
    
    public static int Longitud(int numeroPasado) {
        int longitud = 1;
        while (numeroPasado > 9) {
            numeroPasado /= 10;
            longitud++;
        }
        return longitud;

    }
}
