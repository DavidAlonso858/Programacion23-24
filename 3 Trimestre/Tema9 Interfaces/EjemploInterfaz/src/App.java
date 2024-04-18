public class App {
    public static void main(String[] args) {
        Perro p = new Perro();
        Gato g = new Gato();

        g.voz();
        p.voz();

        g.vozDurmiendo();
        Sonido.bostezo();

        System.out.println(Sonido.version); // acedemos desde Sonido y los implementos

    }
}
