public class Publicacion {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String codigoISBN;

    public Publicacion(String titulo, String autor, int añoPublicacion, String codigoISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.codigoISBN = codigoISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "\ntitulo: " + this.titulo;
        cadena += "\nautor: " + this.autor;
        cadena += "\naño publicacion: " + this.añoPublicacion;
        cadena += "\ncodigo ISBN: " + this.codigoISBN;
        return cadena;
    }
}
