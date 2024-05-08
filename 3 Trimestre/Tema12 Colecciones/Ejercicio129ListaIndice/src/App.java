import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        List<Integer> lista = new LinkedList<>();

        do {

            System.out.print("Introduzca entero positivo (negativo para salir): ");
            n = sc.nextInt();

            if (n >= 0) {
                lista.add(n);
            }
        } while (n >= 0);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                
            }
        }
    }
}
