public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void respirar() {
        System.out.println("El animal esta respirando");
    }

    public void come() {
        System.out.println("El animal va a comer");
    }

    public void desplaza() {
        System.out.println("Se desplaza");
    }
}
