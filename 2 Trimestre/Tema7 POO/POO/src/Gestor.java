public class Gestor {
    public String nombre;
    double impMaximo;
    private int telefono;

    public Gestor(String nombre, int telefono) { // constructor sin asignar importe
        this.nombre = nombre;
        this.telefono = telefono;
        impMaximo = 10000.0;
    }

    public Gestor(String nombre, double impMaximo, int telefono) { // constructor completo
        this.nombre = nombre;
        this.impMaximo = impMaximo;
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void mostrarGestor() {
        System.out.println("Nombre Gestor: " + nombre);
        System.out.println("Importe maximo asignado: " + impMaximo);
        System.out.println("Telefono de contacto: " + telefono);
    }
}
