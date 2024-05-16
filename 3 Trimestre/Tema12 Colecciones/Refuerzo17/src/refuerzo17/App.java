package refuerzo17;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        Cola<String> cola1 = new Cola<>(new ArrayList<>());
        // le pasamos el tipo a la clase parametrizada entre parentesis
        cola1.guardar("David");
        cola1.guardar("Alonso");
        cola1.guardar("Garcia");
        cola1.guardar("David");
        
        System.out.println(cola1.quitar());
        System.out.println(cola1);
    }
}
