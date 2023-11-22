import java.util.Scanner;

public class Ejercicio419 {
    
    public static String numerosAleatorios(int cantAleatorios, int valorMinimo, int valorMaximo) {
        String cadena = "";
        int resultado = 0;

        System.out.println("Numeros aleatorios: ");
        for (int cont = 1; cont <= cantAleatorios; cont++) {
            resultado = (int) (Math.random() * (valorMaximo - valorMinimo) + 1);
            cadena += " - " + resultado;
        }
        return cadena;

    }

    public static String numerosAleatorios(int cantAleatorios) {
        String cadena = "";
        double resultado = 0;

        System.out.println("Numeros aleatorios: ");
        for (int cont = 1; cont <= cantAleatorios; cont++) {
            resultado = (Math.random() * (1 - 0));
            cadena += " - " + resultado;
        }
        return cadena;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantAleatorios = 5, valorMinimo = 1, valorMaximo = 100;

        System.out.println(numerosAleatorios(cantAleatorios));
    }
}
