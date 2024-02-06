import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase1 = "Buenos Dias";
        String frase2 = "Buenas Noches";
        int longitud1, longitud2;
        boolean mayor;
        
        longitud1 = frase1.length();
        longitud2 = frase2.length();

        mayor = longitud1 > longitud2;
        if (!mayor) {
            System.out.println("La frase '" + frase1 + "' es la menor");
        } else {
            System.out.println("La frase '" + frase2 + "' es la menor");
        }
    }
}
