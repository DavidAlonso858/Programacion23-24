import java.util.Scanner;

public class EjemploLongitud {
    public static int Longitud(int numeroPasado) { // se puede cambiar el nombre de la variable
        int longitud = 1;
        while (numeroPasado > 9) {
            numeroPasado /= 10;
            longitud++;
        }
        return longitud;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();

        int longitud = Longitud(numero); // guardamos como variable la funcion utilizada para mostrarla
        System.out.println("La longitud de ese numero es: " + longitud);
    }

}
