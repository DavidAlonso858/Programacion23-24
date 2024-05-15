package ejercicio1221aleatorio;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static int aleatorio(int limite) {
        int n;

        n = (int) (Math.random() * (limite));

        return n;
    }

    public static void main(String[] args) {
        Set<Integer> ordenDecreciente = new TreeSet<>((n1, n2) -> n2 - n1);

        while (ordenDecreciente.size() < 20) {
            ordenDecreciente.add(aleatorio(100));
        }

        System.out.println("Veinte numeros aleatorios menores de 100 en orden decreciente -> " + ordenDecreciente);
    }

}
