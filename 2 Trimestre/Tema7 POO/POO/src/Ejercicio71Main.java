public class Ejercicio71Main {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("David", "75923724B"); // pasamos los datos creados a la clase

        c1.ingresoDinero(1200);
        c1.sacarDinero(250);
        c1.mostrarCuenta();
    }
}
