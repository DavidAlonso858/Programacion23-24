public class Libro extends Publicacion implements Prestable {
    private int numeroPaginas;
    private int capituloMuestra;
    private boolean prestado = false;

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

    @Override
    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

    @Override
    public void presta() {
        if (this.prestado) {
            System.out.println("Lo siento, ese libro ya esta prestado");
        } else {
            this.prestado = true;
        }
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
