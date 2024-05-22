package pruebadaw;

public abstract class Policia implements Comparable<Policia> {

    private String codigo;
    private String nombre;
    private double sueldo;

    public Policia(String codigo, String nombre, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
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
