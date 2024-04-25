public class Futbolista implements Comparable {
    private String dni;
    private String nombre;
    private int edad;
    private int numeroGoles;

    public Futbolista(String dni, String nombre, int edad, int numeroGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public boolean equals(Futbolista f) {
        return this.dni.equals(f.dni);
    }

    @Override
    public int compareTo(Object o) {
        Futbolista f1 = (Futbolista) o;

        return dni.compareTo(f1.dni);
    }

    @Override
    public String toString() {
        return "\nFutbolista -> dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", numeroGoles=" + numeroGoles;
    }

}
