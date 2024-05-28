package examen24mayodaw;

public class AlumnadoNEAE extends Alumnado implements Calculable {

    private double coeficienteCorrecion;

    public AlumnadoNEAE(String nombre, double coeficienteCorrecion) {
        super(nombre);
        if (coeficienteCorrecion >= 1.5 && coeficienteCorrecion <= 3.0) {
            this.coeficienteCorrecion = coeficienteCorrecion;
        } else {
            this.coeficienteCorrecion = 1.5;
        }
    }

    public double getCoeficienteCorrecion() {
        return coeficienteCorrecion;
    }

    public void setCoeficienteCorrecion(double coeficienteCorrecion) {
        if (coeficienteCorrecion >= 1.5 && coeficienteCorrecion <= 3.0) {
            this.coeficienteCorrecion = coeficienteCorrecion;
        } else {
            this.coeficienteCorrecion = 1.5;
        }
    }

    @Override
    public double calculoNota(double notaInicial) {
        return notaInicial * coeficienteCorrecion;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        cadena += ", Coeficiente Correcion-> " + this.coeficienteCorrecion;

        return cadena;
    }

}
