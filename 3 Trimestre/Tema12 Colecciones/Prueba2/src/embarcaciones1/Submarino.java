package embarcaciones1;

public class Submarino extends Barco {

    private static Integer contador = 1;

    public Submarino(Double longitud) {
        super("Sub-" + Integer.toString(contador), longitud);
        contador++;
    }

    public Double getPeriscopio() {
        return longitud / 10;
    }

}
