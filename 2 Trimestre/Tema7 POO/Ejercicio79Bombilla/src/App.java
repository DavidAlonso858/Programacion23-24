public class App {
    public static void main(String[] args) {
        Bombilla.interruptorGeneral = true; // le damos luz al ser estatico se aplica a todos los objetos de la clase
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();

        System.out.println("b1: " + b1.revision()); // apagada por defecto
        b1.enciende();

        System.out.println("b1: " + b1.revision());

        System.out.println("b2: " + b2.revision()); // apagada por defecto
        b2.enciende();

        System.out.println("b2: " + b2.revision());
    }
}
