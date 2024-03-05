public class App {
    public static void main(String[] args) {
        MarcaPagina Mp1 = new MarcaPagina(1, 200);

        Mp1.incrementarPagina(30);

        Mp1.obtenerInfo();
        Mp1.nuevaLectura();
        Mp1.incrementarPagina(25);
        Mp1.obtenerInfo();

    }
}
