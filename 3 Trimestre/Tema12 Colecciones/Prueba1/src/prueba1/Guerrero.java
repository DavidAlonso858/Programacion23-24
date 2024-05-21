package prueba1;

import java.io.Serializable;

public class Guerrero extends Personaje implements Serializable {

    private String cod;

    public Guerrero() {
        this.setNivelVida(15); // al ser protected no hace falta declaralo aqui
        cod = "2" + this.getContador();
        this.setCodigo(cod); // al ser protected no hace falta declaralo aqui
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
