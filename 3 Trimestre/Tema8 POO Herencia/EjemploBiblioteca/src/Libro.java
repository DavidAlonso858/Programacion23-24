public class Libro extends Publicacion {
    private int numeroPaginas;
    private int capituloMuestra;

    public Libro(String titulo, String autor, int añoPublicacion, String codigoISBN, int numeroPaginas,
            int capituloMuestra) {
        super(titulo, autor, añoPublicacion, codigoISBN);
        this.numeroPaginas = numeroPaginas;
        this.capituloMuestra = capituloMuestra;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getCapituloMuestra() {
        return capituloMuestra;
    }

    public void setCapituloMuestra(int capituloMuestra) {
        this.capituloMuestra = capituloMuestra;
    }

    @Override
    public String toString() {
        String cadena = super.toString();

        cadena += "\nnumero de paginas: " + this.numeroPaginas;
        cadena += "\ncapitulo muestra: " + this.capituloMuestra;

        return cadena;
    }

}
