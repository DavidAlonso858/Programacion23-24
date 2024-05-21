package prueba1;

import java.io.Serializable;

public class Jefe extends Personaje implements Serializable {

    private Integer vidaExtra;
    private String cod;

    public Jefe() {
        this.setNivelVida(20);;
        cod = "1" + this.getContador();
        this.setCodigo(cod);
        vidaExtra = (int) Integer.parseInt(this.getCodigo()) / 2;
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
