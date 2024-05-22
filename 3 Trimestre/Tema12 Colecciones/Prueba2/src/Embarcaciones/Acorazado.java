package Embarcaciones;

public class Acorazado extends Barco {

    private static Integer contador = 1;
    private Integer numCa;

    public Acorazado(Double longitud, Integer numCa) {
        super("Ac-" + Integer.toString(contador), longitud);
        this.numCa = numCa;
        contador++;
    }

    public Integer getNumCa() {
        return numCa;
    }

    public void setNumCa(Integer numCa) {
        this.numCa = numCa;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        cadena += "Numeros cañones-> " + numCa;
        return cadena;
    }
}
