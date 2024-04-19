import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Socio[] socios = {
                new Socio(1, "Pepe", "01-01-2001"),
                new Socio(2, "Rosa", "01-01-2004")
        };

        Arrays.sort(socios);
        System.out.println(Arrays.toString(socios));
        // System.out.println("Por cuantos años es mayor Pepe: " + s1.compareTo(s2));

    }
}
