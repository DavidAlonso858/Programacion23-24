package pruebapoo;

public class Puntuacion {

    private String nombreJugador;
    private int puntuacion;

    public Puntuacion(String nombreJugador, int puntuacion) {
        this.nombreJugador = nombreJugador;
        this.puntuacion = puntuacion;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

}
