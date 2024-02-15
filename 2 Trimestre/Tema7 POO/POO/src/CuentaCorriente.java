public class CuentaCorriente {
    String DNI;
    String nombre;
    double saldo;

    public CuentaCorriente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        saldo = 0;
    }

    public boolean sacarDinero(double dinero) {
        boolean retirarDinero;

        if (dinero >= saldo) {
            saldo -= dinero;
            retirarDinero = true;
        } else {
            System.out.println("No hay tanto dinero para sacar.");
            retirarDinero = false;
        }

        return retirarDinero;
    }

    public void ingresoDinero(double dinero) {
        saldo += dinero;
    }

    public void mostrarCuenta() {
        System.out.println("DNI: " + DNI);
        System.out.println("Nombre propietario: " + nombre);
        System.out.println("Saldo: " + saldo + " euros");
    }
}
