package prueba1;

public abstract class Personaje {

    protected String codigo; //protected si heredan
    protected Integer nivelVida; //protected si heredan
    protected static Integer contador = 0; //protected si heredan

    public Personaje() {
        this.codigo = codigo;
        this.nivelVida = nivelVida;
        contador++;
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
        return "Personaje{" + "codigo-> " + codigo + ", nivelVida-> " + nivelVida + " clase-> " + getClass() + '}';
    }
}
