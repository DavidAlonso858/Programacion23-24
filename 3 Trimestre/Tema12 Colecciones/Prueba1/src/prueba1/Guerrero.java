package prueba1;

import java.io.Serializable;

public class Guerrero extends Personaje implements Serializable {

    private static Integer contador = 1;

    public Guerrero() {
        super("2" + Integer.toString(contador), 15);
        contador++;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
