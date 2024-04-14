public class Mamifero extends Animal {
    public Mamifero(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void come() {
        System.out.println("El mamifero come de todo");
    }

    @Override
    public void desplaza() {
        super.desplaza();
    }

    public void gruñe() {
        System.out.println("El mamifero gruñe");
    }
}
