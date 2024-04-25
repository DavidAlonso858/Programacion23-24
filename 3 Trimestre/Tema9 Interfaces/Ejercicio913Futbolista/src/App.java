import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Futbolista[] futbolistas = { new Futbolista("75923724B", "David", 22, 18),
                new Futbolista("92345671Z", "Bellingham", 20, 25),
                new Futbolista("12345678B", "Joselu", 34, 10),
                new Futbolista("87654321N", "Rodrygo", 23, 12),
                new Futbolista("66666666T", "Vinicius", 24, 30),
        };

        Arrays.sort(futbolistas);
        System.out.println("\nComparacion por DNI: \n" + Arrays.toString(futbolistas)); // orden por dni por el
                                                                                        // compareTo de la clase
                                                                                        // Futbolista

        Arrays.sort(futbolistas, new ComparaNombre());
        System.out.println("\nComparacion por NOMBRE: \n" + Arrays.toString(futbolistas)); // orden por el nombre creado
                                                                                           // con el compare en la clase
                                                                                           // aparte

        Arrays.sort(futbolistas, new ComparaEdad());
        System.out.println("\nComparacion por EDAD: \n" + Arrays.toString(futbolistas)); // orden por la edad creada con
                                                                                         // el compare en la clase
                                                                                         // aparte

    }
}
