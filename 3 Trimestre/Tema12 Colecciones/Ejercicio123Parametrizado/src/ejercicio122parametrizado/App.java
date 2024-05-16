package ejercicio122parametrizado;

public class App {

    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        for (int i = 0; i < 5; i++) {
            c.insertarAlFinal(i);
        }

        for (int i = 5; i < 10; i++) {
            c.insertarAlPrincipio(i);
        }
        System.out.println("Sin ordenar: " + c);

        c.ordenar();
        System.out.println("Ordenado: " + c);

        Integer n = c.extraerDelFinal();
        Integer n2 = c.extraerDelPrincipio();

        System.out.println(n);
        System.out.println(n2);

        System.out.println("Despuede de la extracion: " + c);
    }
}
