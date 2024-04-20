package examentema8;

public abstract class Personaje {

    protected String codigo = "";
    protected static int contador = 0;
    protected int nivelVida;

    public Personaje() { // int para poder controlar los digitos mejor y static por el orden de creacion que dice el enunciado
        this.codigo = codigo;
        this.nivelVida = nivelVida;
        this.contador++;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }

    @Override
    public String toString() {
        return "Personaje " + "codigo-> " + codigo + ", nivelVida-> " + getNivelVida() + " Clase-> " + getClass();
    }

}
