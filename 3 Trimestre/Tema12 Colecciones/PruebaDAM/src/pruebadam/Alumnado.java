package pruebadam;

import java.util.Objects;

public class Alumnado {

    protected Integer NIE;
    protected static Integer contador = 1;
    protected String nombre;

    public Alumnado(String nombre) {
        this.NIE = contador;
        this.nombre = nombre;
        contador++;
    }

    public Integer getNIE() {
        return NIE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIE(Integer NIE) {
        this.NIE = NIE;
    }

    @Override
    public boolean equals(Object obj) {
        Alumnado a1 = (Alumnado) obj;

        return this.getNIE().equals(a1.getNIE());
    }

    @Override
    public String toString() {
        return "Alumnado{ NIE-> " + NIE + ", " + "Nombre-> " + nombre + '}';
    }

}
