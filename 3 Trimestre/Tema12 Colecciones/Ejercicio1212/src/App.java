import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {
    static Scanner sc = new Scanner(System.in);

    // metodo para unir los elementos de dos cojuntos en uno
    public static Set<Integer> union(Set<Integer> c1, Set<Integer> c2) {
        Set<Integer> union = new TreeSet<>(c1);
        union.addAll(c2);

        return union;
    }

    public static Set<Integer> interseccion(Set<Integer> c1, Set<Integer> c2) {
        Set<Integer> inter = new TreeSet<>(c1);
        inter.retainAll(c2); // elimina todo lo que no coincida con este elemento

        return inter;
    }

    public static void main(String[] args) {
        Set<Integer> conjunto1 = new TreeSet<>();
        Set<Integer> conjunto2 = new TreeSet<>();

        conjunto1.add(4);
        conjunto1.add(8);
        conjunto1.add(43);
        conjunto1.add(34);
        
        conjunto2.add(7);
        conjunto2.add(8);
        conjunto2.add(43);
        conjunto2.add(77);
        System.out.println(conjunto1);
        System.out.println(conjunto2);
        System.out.println("\nUne los dos conjuntos " + union(conjunto1, conjunto2));
        System.out.println("Los elementos que coinciden en los dos conjuntos " + interseccion(conjunto1, conjunto2));
    }
}
