import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n, sumaPositivo = 0, sumaNegativo = 0;
        Collection<Double> listaPositiva = new LinkedList<>();
        Collection<Double> listaNegativa = new LinkedList<>();

        System.out.println("\n~~~~ Colecciones de numeros. INTRODUZCA 0 PARA SALIR ~~~~");
        do {
            System.out.print("Introduzca un numero real: ");
            n = sc.nextDouble();

            if (n > 0) {
                listaPositiva.add(n);
            } else if (n < 0) {
                listaNegativa.add(n);
            }

        } while (n != 0);

        System.out.println("\nLista Positiva");
        for (Double double1 : listaPositiva) {
            sumaPositivo += double1;
        }
        System.out.println(listaPositiva);
        System.out.println("Suma de sus elementos: " + sumaPositivo);

        System.out.println("\nLista Negativa");
        for (Double double2 : listaNegativa) {
            sumaNegativo += double2;
        }
        System.out.println(listaNegativa);
        System.out.println("Suma de sus elementos: " + sumaNegativo);

        Iterator<Double> it = listaPositiva.iterator();
        System.out.println("\nLista Positiva <= 10");
        while (it.hasNext()) {
            if (it.next() > 10) {
                it.remove();
            }
        }
        System.out.println(listaPositiva);

        Iterator<Double> it2 = listaNegativa.iterator();

        System.out.println("\nLista negativa >= -10");
        while (it2.hasNext()) {
            if (it2.next() < -10) {
                it2.remove();
            }
        }
        System.out.println(listaNegativa);

    }

}
