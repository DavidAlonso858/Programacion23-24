public class App {
    public static void main(String[] args) {
        Piramide p = new Piramide(4);
        Retangulo r1 = new Retangulo(4, 3);
        Retangulo r2 = new Retangulo(6, 2);

        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("Piramides creadas: " + Piramide.getPiramidesCreadas());
        System.out.println("Rectangulos creados: " + Retangulo.getRectangulosCreados());

    }
}
