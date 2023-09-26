import java.util.Scanner;

public class EjercicioShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short prueba;
        prueba = -32768;
        System.out.println("Rango minimo: " + prueba + "\n");
        prueba--;

        System.out.println("El valor siguiente seria: " + prueba);
    }
}
