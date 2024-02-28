public class Punto {
    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx) {
        x += dx;
    }

    public void desplazaY(double dy) {
        y += dy;
    }

    public void desplaza(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distanciaEuclidea(Punto otro) {
        double d, potencia1, potencia2, potenciaFinal;
        // d = √((x2 - x1)² + (y2 - y1)²) Formula para calcularla
        potencia1 = Math.pow(this.x - otro.x, 2);
        potencia2 = Math.pow(this.y - otro.y, 2);
        potenciaFinal = potencia1 + potencia2;

        d = Math.sqrt(potenciaFinal); // La raiz de la suma de las potencias de los dos puntos restados

        return d;
    }

    public void muestra() {
        System.out.println("El punto en el eje x se encuentra en: " + x);
        System.out.println("El punto en el eje y se encuentra en: " + y + "\n");
    }
}
