package prueba1;

import java.io.Serializable;

public class Jefe extends Personaje implements Serializable {

    private Integer vidaExtra;
    private static Integer contador = 1;

    public Jefe() {
        super("1" + Integer.toString(contador), 20);
        this.vidaExtra = Integer.parseInt("1" + contador) / 2;
        contador++;
    }

    public Integer getVidaExtra() {
        return vidaExtra;
    }

    public void setVidaExtra(Integer vidaExtra) {
        this.vidaExtra = vidaExtra;
    }

    @Override
    public String toString() {
        String cadena = super.toString(); // lo paso a cadena para almacenar el dato nuevo
        cadena += "vida extra-> " + this.vidaExtra;

        return cadena;
    }

}
