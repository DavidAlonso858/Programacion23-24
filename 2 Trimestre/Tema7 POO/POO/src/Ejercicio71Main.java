public class Ejercicio71Main {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("David", "75923724B"); // pasamos los datos creados a la clase

        c1.ingresoDinero(1200);
        c1.sacarDinero(250);
        c1.mostrarCuenta();

        System.out.println("Puedo sacar " + c1.sacarDinero(970));

        c1 = new CuentaCorriente("75923724B", 2000); // Constructor sobre cargado del 7.2
        System.out.println();
        c1.mostrarCuenta();
        c1.setEntidadBancaria("Santander"); // le asigno el banco a la cuenta
        c1.mostrarCuenta();

        Gestor g1 = new Gestor("Juana", 606743223);

        c1 = new CuentaCorriente("75923724B", "David", 100, g1);
        c1.setEntidadBancaria("Caixa");
        c1.mostrarCuenta();
    }
}
