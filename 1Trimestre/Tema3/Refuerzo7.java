import java.util.Scanner;

public class Refuerzo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinacion, clave;

        combinacion = (int) (Math.random() * (9999 - 1000) + 1);

        for (int intentos = 0; intentos < 4; intentos++) {
            System.out.print("Control de acceso, introduzca la clave de cuatro cifras: ");
            clave = sc.nextInt();
            if (clave == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            } else {
                System.out.println("Lo siento, esa no es la combinancion");
            }
        }
        System.out.println(combinacion);
    }
}
