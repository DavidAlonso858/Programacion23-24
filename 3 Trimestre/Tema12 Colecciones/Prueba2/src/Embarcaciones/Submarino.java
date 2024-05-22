package Embarcaciones;

public class Submarino extends Barco {

    private static Integer contador = 1;

    public Submarino(Double longitud) {
        super("Sub-" + Integer.toString(contador), longitud);
    }

    public Double getPeriscopio() {
        return longitud / 10;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
