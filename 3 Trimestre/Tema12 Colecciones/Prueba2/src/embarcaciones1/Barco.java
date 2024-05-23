package embarcaciones1;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.longitud);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Barco other = (Barco) obj;
        return Objects.equals(this.longitud, other.longitud);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{ codigo-> " + codigo + ", longitud-> " + longitud + '}';
    }

}
