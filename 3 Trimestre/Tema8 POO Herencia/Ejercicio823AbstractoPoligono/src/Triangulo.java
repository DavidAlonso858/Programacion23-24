public class Triangulo extends Poligono {

    public Triangulo(double base, double altura) { // constructor con lo de la super clase
        super(base, altura);
    }

    @Override
    public double area() {

        return (base * altura) / 2;
    }

}
