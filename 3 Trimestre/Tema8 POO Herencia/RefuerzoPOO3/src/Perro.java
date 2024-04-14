public class Perro extends Mamifero {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void come() {
        // TODO Auto-generated method stub
        super.come();
    }

    @Override
    public void desplaza() {
        // TODO Auto-generated method stub
        super.desplaza();
    }

    @Override
    public void gruñe() {
        // TODO Auto-generated method stub
        super.gruñe();
    }

    @Override
    public void respirar() {
        // TODO Auto-generated method stub
        super.respirar();
    }

    public void feliz() {
        System.out.println("El perro no para de mover la cola");
    }
}
