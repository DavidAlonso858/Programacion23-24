package refuerzo18;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Pila<Character> pila1 = new Pila<>(new ArrayList<>());

        pila1.guardar('A');
        pila1.guardar('B');
        pila1.guardar('C');
        pila1.guardar('D');

        System.out.println(pila1.quitar());

        System.out.println(pila1);
    }
}
