package pruebapoo;

public class Main {

    public static void main(String[] args) {
        Puntuacion p1 = new Puntuacion("David", 100);
        Puntuacion p2 = new Puntuacion("Maria", 10);
        Juego j1 = new Juego(); // un mismo juego para todos los usuarios

        j1.añadirPuntuaciones(p1);
        j1.añadirPuntuaciones(p2);

        p1.setPuntuacion(200); // modifico la del primer usuario para que tenga en cuenta las dos
        j1.añadirPuntuaciones(p1);

        j1.mostrarPuntuaciones();
    }
}
