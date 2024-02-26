public class App {
    public static void main(String[] args) {
        Colores c1 = new Colores();

        c1.coloresDisponibles();
        c1.añadirColor("rojo");
        c1.coloresDisponibles();

        c1.tablaColoresNecesarios(4);
    }
}
