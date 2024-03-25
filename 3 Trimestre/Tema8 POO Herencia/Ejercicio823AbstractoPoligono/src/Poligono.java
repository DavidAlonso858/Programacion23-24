public abstract class Poligono {
    protected double base;
    protected double altura;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract double area(); // sin cuerpo al ser un metodo abstracto que van a desarrollar las clases hijas

}
