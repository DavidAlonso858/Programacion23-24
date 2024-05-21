package prueba1;

import java.io.Serializable;

public abstract class Personaje implements Serializable {

    private String codigo; //protected si heredan
    private Integer nivelVida; //protected si heredan

    public Personaje(String codigo, Integer nivelVida) {
        this.codigo = codigo;
        this.nivelVida = nivelVida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(Integer nivelVida) {
        this.nivelVida = nivelVida;
    }

    @Override
    public String toString() {
        return "Personaje{" + "codigo-> " + codigo + ", nivelVida-> " + nivelVida + " clase-> " + getClass().getSimpleName() + "}\n";
    }
}
