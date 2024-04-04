public class Linea {
    private Punto p;
    private Punto p2;

    public Linea(Punto p, Punto p2) {
        this.p = p;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Linea formada por los puntos " + p + " y " + p2;
    }

}
