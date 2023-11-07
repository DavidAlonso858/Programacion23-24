import java.util.Scanner;

public class Ejercicio319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNat, result = 0, valor = 0, valor2 = 0;
        do {
            System.out.print("Introduzca el numero natural: ");
            numNat = sc.nextInt();
        } while (numNat < 0);

        for (int aprox = 0; result <= numNat; aprox++) {
            result = (int) Math.pow(aprox, 2);
            if (result <= numNat) {
                valor = aprox;
                valor2 = result;
            }
        }
        System.out.println("La raiz cuadrada o la mas cercana es: " + valor);
        System.out.println("Cuyo resultado es: " + valor2);

    }

}
