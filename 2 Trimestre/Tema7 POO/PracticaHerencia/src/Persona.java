public class Persona {
    String nombre;
    int edad;
    double estatura;

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Estatura: " + estatura);
        System.out.println("Edad: " + edad);
    }
}
