package prueba1;

import java.io.Serializable;

public abstract class Personaje implements Serializable {

    private String codigo; //protected si heredan
    private Integer nivelVida; //protected si heredan
    private static Integer contador = 0; //protected si heredan

    public Personaje() {
        this.codigo = codigo;
        this.nivelVida = nivelVida;
        contador++;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Personaje.contador = contador;
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
