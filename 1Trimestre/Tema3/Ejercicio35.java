import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado, ale, ale1, num, check = -1;

        do {
            ale = (int) (Math.random() * (100 - 1) + 1);
            ale1 = (int) (Math.random() * (100 - 1) + 1);

            System.out.println(ale);
            System.out.println(ale1);
            resultado = ale + ale1;
            System.out.print("Introduzca el resultado de la suma de esos numeros: ");
            num = sc.nextInt();
            check++;
        } while (num == resultado);
        System.out.println("Has realizado correctamente: " + check + " sumas");
    }
}
