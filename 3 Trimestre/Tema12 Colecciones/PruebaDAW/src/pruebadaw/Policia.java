package pruebadaw;

public abstract class Policia implements Comparable<Policia> {

    protected String codigo;
    protected String nombre;
    protected double sueldo;
    protected static Integer contador = 0;

    public Policia(String nombre) {
        this.codigo = "" + contador;
        this.nombre = nombre;
        this.sueldo = 1750;
        contador++;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int compareTo(Policia o) {

        return this.codigo.compareTo(o.codigo); // .compareTo
    }

    @Override
    public String toString() {
        return "Policia{ codigo-> " + codigo + ", nombre-> " + nombre + ", sueldo-> " + sueldo + '}';
    }

}
