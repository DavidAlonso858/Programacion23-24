import java.util.Scanner;

public class Ejercicio51 {
    
    public static int aleatorio() {
        int aleatorio = (int) (Math.random() * (100 - 1) + 1);
        return aleatorio;
    }

    public static void arrayMostrar10(int[] tabla) {
        int suma = 0;
        for (int contador = 0; contador < tabla.length; contador++) {
            tabla[contador] = aleatorio();
            System.out.println(tabla[contador]);
            suma += tabla[contador];
        }

        /*
         * for(int totalCont: tabla) para recorrerlo se pone del mismo tipo
         * suma+= totalCont;
         */
        System.out.println("\nLa suma de este contenido es: " + suma);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];

        arrayMostrar10(tabla);
    }

}
