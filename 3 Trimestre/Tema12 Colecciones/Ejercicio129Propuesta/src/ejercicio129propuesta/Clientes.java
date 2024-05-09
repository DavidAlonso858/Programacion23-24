package ejercicio129propuesta;

public class Clientes implements Comparable { // compareTo
    private String dni;
    private String nombre;
    private int edad;

    public Clientes(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {
        Clientes c = (Clientes) o;

        return this.edad - c.edad;
    }

    @Override
    public String toString() {
        return "Clientes [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
    }

}
