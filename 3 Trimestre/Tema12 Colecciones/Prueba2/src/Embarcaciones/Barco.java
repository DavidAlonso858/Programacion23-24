package Embarcaciones;

public abstract class Barco {

    protected String codigo;
    protected Double longitud;

    public Barco(String codigo, Double longitud) {
        this.codigo = codigo;
        this.longitud = longitud;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    @Override
    public boolean equals(Object obj) {
        Barco b = (Barco) obj;
        return this.longitud.equals(b.longitud);
    }

    @Override
    public String toString() {
        return "Barco{ codigo-> " + codigo + ", longitud-> " + longitud + "Clase-> " + getClass().getSimpleName() + '}';
    }

}
