public class CajaCarton extends Caja {

    public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
        super(ancho, alto, fondo, unidad);
    }

    @Override
    public double getVolumen() { // mismo metodo pero el 80% del volumen y sin pasar a m3
        double volumen80;
        volumen80 = (ancho * alto * fondo) * 0.80;
        return volumen80;
    }

    public double superficie() {
        double superficie;

        superficie = 2 * (ancho * alto + alto * fondo + fondo * ancho); // formula superficie caja

        return superficie;
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
