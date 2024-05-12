package ejercicio1224union;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio1224Union {
    public static int aleatorio() {
        int n;

        n = (int) (Math.random() * (50));

        return n;
    }

    public static void main(String[] args) {
        List<Integer> lista1 = new LinkedList<>();
        List<Integer> lista2 = new LinkedList<>();

        while (lista1.size() < 5 && lista2.size() < 5) {
            lista1.add(aleatorio());
            lista2.add(aleatorio());
        }

        Collections.sort(lista1);
        lista2.sort(null);

        List<Integer> listaFinal = new LinkedList<>(lista1); // le paso la primera y añado la segunda

        listaFinal.addAll(lista2);

        listaFinal.sort(null);

        System.out.println(listaFinal);
        System.out.println(lista1 + " y " + lista2);
    }
}
