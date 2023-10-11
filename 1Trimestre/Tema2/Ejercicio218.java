import java.util.Scanner;

public class Ejercicio218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, ale1, ale2, resultado = 0, operacion;

        ale1 = (int) (Math.random() * (99 - 1)) + 1;
        ale2 = (int) (Math.random() * (99 - 1)) + 1;
        operacion = (int) (Math.random() * (4 - 1)) + 1;

        switch (operacion) {
            case 1:
                System.out.println("Tienes que sumar el numero: " + ale1 + " y " + ale2);
                resultado = ale1 + ale2;
                break;
            case 2:
                System.out.println("Tienes que restar el numero: " + ale1 + " y " + ale2);
                resultado = ale1 - ale2;
                break;
            case 3:
                System.out.println("Tienes que multiplicar el numero: " + ale1 + " y " + ale2);
                resultado = ale1 * ale2;
                break;
        }

        System.out.print("¿Cual es el resultado hmm? ");
        sum = sc.nextInt();

        if (resultado == sum) {
            System.out.println("\nHas acertado, eres un genio");
        } else {
            System.out.println("\nMe temo que has fallado");
        }
    }
}
