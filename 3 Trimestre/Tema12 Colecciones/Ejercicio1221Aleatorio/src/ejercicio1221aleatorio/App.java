package ejercicio1221aleatorio;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static int aleatorio100() {
        int n;

        n = (int) (Math.random() * (100));

        return n;
    }

    public static void main(String[] args) {
        Set<Integer> ordenDecreciente = new TreeSet<>((n1, n2) -> n2 - n1);

        for (int i = 0; i < 20; i++) {
            ordenDecreciente.add(aleatorio100());
        }

        System.out.println("Veinte numeros aleatorios menores de 100 en orden decreciente -> " + ordenDecreciente);
    }

}
