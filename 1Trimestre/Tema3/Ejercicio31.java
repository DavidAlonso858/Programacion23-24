import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerin, raiz;
        boolean esPar = false, esPositivo = false, esCuadrado = false;

        System.out.print("Introduzca el numero: ");
        numerin = sc.nextInt();

        while (numerin != 0) {
            esPar = numerin % 2 == 0;
            esPositivo = numerin > -1;
            raiz = (int) Math.sqrt(numerin);
            esCuadrado = raiz * raiz == numerin;

            System.out.println("Es par: " + esPar);
            System.out.println("Es positivo: " + esPositivo);
            System.out.println("Es cuadrado: " + esCuadrado);
            System.out.println("Su cuadrado: " + (numerin * numerin));

            System.out.print("Introduzca el numero: ");
            numerin = sc.nextInt();
        }
    }
}
