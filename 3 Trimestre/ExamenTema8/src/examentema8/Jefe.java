package examentema8;

public class Jefe extends Personaje {

    private int vidaExtra;

    public Jefe() {
        this.codigo = "1" + contador;
        this.vidaExtra = (Integer.parseInt(codigo) / 2);
        this.nivelVida = 20 + vidaExtra;
    }

    public int getVidaExtra() {
        return vidaExtra;
    }

    public void setVidaExtra(int vidaExtra) {
        this.vidaExtra = vidaExtra;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        cadena += " Vida extra-> " + this.vidaExtra;
        return cadena;
    }

}
