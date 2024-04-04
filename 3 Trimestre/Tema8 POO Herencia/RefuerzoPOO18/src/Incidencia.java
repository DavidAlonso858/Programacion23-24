public class Incidencia {
    private int puesto;
    private String problema;
    private String resolucion = "";
    private String estado;
    private int incidencia;

    private static int incidenciaSumar = 1;
    private static int pendientes = 0;

    public Incidencia(int puesto, String problema) {
        this.puesto = puesto;
        this.problema = problema;
        this.incidencia = incidenciaSumar++;
        this.pendientes++;
        this.estado = "Pendiente";
    }

    public void resuelve(String texto) {
        this.estado = "Resuelta";
        this.resolucion = texto;
        setPendientes(getPendientes() - 1);
    }

    public static void setPendientes(int pendientes) {
        Incidencia.pendientes = pendientes;
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        return "Incidencia " + incidencia + " Puesto: " + puesto + " - " + problema + " - "
                + estado + " - " + resolucion;
    }

}
