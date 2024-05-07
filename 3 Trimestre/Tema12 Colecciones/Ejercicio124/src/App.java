import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Collection podria ser ya que usa metodos generales
        List<Integer> listaNumeros = new LinkedList<>();

        System.out.print("\nIntroduzca un numero positivo o -1 si quieres salir: ");
        n = sc.nextInt();

        while (n >= 0) {
            listaNumeros.add(n);
            System.out.print("Introduzca un numero positivo o -1 si quieres salir: ");
            n = sc.nextInt();
        }

        System.out.println("\nCOLECCION ENTERA: ");
        for (Integer i : listaNumeros) {
            System.out.println(i);
        }

        System.out.println("COLECCION SOLO PARES: ");
        for (Integer i : listaNumeros) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("COLECCION SIN MULTIPLOS 3: ");
        Iterator<Integer> it = listaNumeros.iterator(); // iterador que solo se puede usar una vez hace lo mismo que el
                                                        // for-each salvo en conjunto

        while (it.hasNext()) {
            n = it.next();
            if (n % 3 == 0) {
                it.remove();
            }
        }

        System.out.println(listaNumeros);
    }
}
