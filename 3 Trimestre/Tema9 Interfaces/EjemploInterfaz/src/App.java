public class App {
    public static void main(String[] args) {
        Perro p = new Perro();
        Gato g = new Gato();
        ClaseA a = new ClaseA();

        g.voz();
        p.voz();

        g.vozDurmiendo();
        Sonido.bostezo();

        a.metodoIA();
        a.metodoIB();
        a.metodoIC();
        a.metodo();
        
        System.out.println(Sonido.version); // acedemos desde Sonido y los implementos

    }
}
