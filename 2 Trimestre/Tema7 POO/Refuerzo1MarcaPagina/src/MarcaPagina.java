public class MarcaPagina {
    public int pagina;
    public int paginaTotales;

    public MarcaPagina(int pagina, int paginasTotales) {
        this.pagina = pagina;
        this.paginaTotales = paginasTotales;
    }

    public void incrementarPagina(int paginaleidas) {
        if (pagina + paginaleidas < paginaTotales) {
            pagina += paginaleidas;
        } else {
            System.out.println("Ya te has terminado el libro");
        }
    }

    public void obtenerInfo() {
        System.out.println("Vas por la pagina " + pagina + " del libro");
    }

    public int nuevaLectura() {
        return pagina = 0;
    }
}
