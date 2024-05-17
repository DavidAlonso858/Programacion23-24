package prueba1;

public class Jefe extends Personaje {

    private Integer vidaExtra;

    public Jefe() {
        nivelVida = 20;
        codigo = "1" + contador;
        vidaExtra = (int) Integer.parseInt(codigo) / 2;
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
        cadena += "vida extra-> " + this.vidaExtra ;

        return cadena;
    }

}
