package pruebadam;

import java.util.Scanner;

public class AlumnadoNEAE extends Alumnado implements Calculable {

    static Scanner sc = new Scanner(System.in);

    private double coeficienteCalificacion;

    public AlumnadoNEAE(String nombre, double coeficienteCalificacion) {
        super(nombre);
        this.NIE = NIE;
        while (coeficienteCalificacion <= 1 || coeficienteCalificacion >= 2) {
            System.out.print("Error. Vuelve a introducir el coeficiente (1.0-2.0: ");
            coeficienteCalificacion = sc.nextDouble();
        }

        this.coeficienteCalificacion = coeficienteCalificacion;
    }

    public double getCoeficienteCalificacion() {
        return coeficienteCalificacion;
    }

    @Override
    public double calculoNota(double notaInicial) {
        return notaInicial * coeficienteCalificacion;
    }

    public void setCoeficienteCalificacion(double coeficienteCalificacion) {
        while (coeficienteCalificacion <= 1 || coeficienteCalificacion >= 2) {
            System.out.print("Error. Vuelve a introducir el coeficiente (1.0-2.0: ");
            coeficienteCalificacion = sc.nextDouble();
        }
        this.coeficienteCalificacion = coeficienteCalificacion;
    }

    @Override
    public String toString() {
        return "AlumnadoNEAE{ NIE->" + NIE + ", " + "Nombre-> " + nombre + ", " + "coeficienteCalificacion-> " + coeficienteCalificacion + '}';
    }

}
