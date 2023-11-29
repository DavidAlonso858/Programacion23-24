import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prueba[] = { 6, 7, -2, 1, 10 }; // recomendable ordenada para las busquedas

        boolean pruebaBoolean[] = { true, false, true, false, true };

        double pruebaDouble[] = { 3.1, 3.56, 3.45, 3.2, 3.9 }; // recomendable ordenada para las busquedas

        System.out.println(prueba);
        System.out.println(pruebaBoolean);
        System.out.println(pruebaDouble);

        System.out.println();
        for (int contador = 0; contador < 5; contador++) {
            System.out.println(prueba[contador]);
        }
        System.out.println();
        for (int contador2 = 0; contador2 < 5; contador2++) {
            System.out.println(pruebaBoolean[contador2]);
        }
        System.out.println();
        for (int contador3 = 0; contador3 < 5; contador3++) {
            System.out.println(pruebaDouble[contador3]);
        }

    }
}
