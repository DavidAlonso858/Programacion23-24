import java.util.Scanner;

public class RefuerzoExtra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = 1;
        int presicion = 1;

        mostrarTaylor(numero, presicion);
    }

    public static double factorial(double numero) {
        int factorial = 1;
        for (int i = 1; i < numero; i++) {
            factorial += i * factorial;
        }
        return factorial;
    }

    public static double Taylor(double numero, int presicion) {
        double resultado = 1;
        for (double i = 1; i <= presicion; i++) {
            resultado += (1 / factorial(i)) * (double)Math.pow(numero, i);
        }
        return resultado;
    }
    
    public static void mostrarTaylor(double numero, int presicion) {
        double numero2=numero+1;
        double numero3=numero+4;

        for (int limite = 10; presicion <= limite; presicion++) {
            System.out.println("\n--PRESICION "+presicion+"--");
            System.out.println("Con presion "+presicion+" el e elevado a "+numero+ " es: "+Taylor(numero, presicion));
            System.out.println("Con presion "+presicion+" el e elevado a "+numero2+ " es: "+Taylor(numero2, presicion));
            System.out.println("Con presion "+presicion+" el e elevado a "+numero3+ " es: "+Taylor(numero3, presicion));
        }
    }
}
