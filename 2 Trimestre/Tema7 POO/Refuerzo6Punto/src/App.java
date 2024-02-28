public class App {
    public static void main(String[] args) {
        Punto p1 = new Punto(4, 2);
        Punto p2 = new Punto(2, 1);

        p1.desplazaX(2);
        p1.desplaza(2, 2);
        p1.muestra();

        p2.desplazaY(1);
        p2.muestra();

        System.out.println("La distancia entre los dos puntos es de: " + p1.distanciaEuclidea(p2));
    }
}
