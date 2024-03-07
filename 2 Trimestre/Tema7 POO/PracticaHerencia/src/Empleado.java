public class Empleado extends Persona {
    double salario;
    String estatura; // para sobrecargarlo

    public Empleado(String nombre, int edad, String estatura, double salario) {
        super(nombre, edad, 1.79); // siempre primero llamar a la superclase en el constructor
        this.salario = salario;
        this.estatura = estatura;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Talla: " + estatura);
        System.out.println("Sueldo: " + salario);
    }
}
