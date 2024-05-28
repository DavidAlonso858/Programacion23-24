package examen24mayodaw;

import java.util.Objects;

public class Alumnado {

    private Integer NIE;
    private static Integer contador = 10;
    private String nombre;

    public Alumnado(String nombre) {
        this.NIE = contador;
        this.nombre = nombre;
        contador++;
    }

    public Integer getNIE() {
        return NIE;
    }

    public void setNIE(Integer NIE) {
        this.NIE = NIE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.NIE);
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
        final Alumnado other = (Alumnado) obj;
        return Objects.equals(this.NIE, other.NIE);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", NIE-> " + NIE + ", nombre-> " + nombre + '}';
    }

}
