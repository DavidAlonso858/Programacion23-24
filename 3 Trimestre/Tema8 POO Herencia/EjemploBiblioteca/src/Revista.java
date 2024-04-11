public class Revista extends Publicacion {
    private int numeroEdicion;
    private String temaPrincipal;

    public Revista(String titulo, String autor, int añoPublicacion, String codigoISBN, int numeroEdicion,
            String temaPrincipal) {
        super(titulo, autor, añoPublicacion, codigoISBN);
        this.numeroEdicion = numeroEdicion;
        this.temaPrincipal = temaPrincipal;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getTemaPrincipal() {
        return temaPrincipal;
    }

    public void setTemaPrincipal(String temaPrincipal) {
        this.temaPrincipal = temaPrincipal;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        cadena += "\nnumero edicion: " + this.numeroEdicion;
        cadena += "\ntema principal: " + this.temaPrincipal;

        return cadena;
    }
}
