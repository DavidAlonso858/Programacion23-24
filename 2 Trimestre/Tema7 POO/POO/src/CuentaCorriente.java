public class CuentaCorriente {
    String DNI; // Ejercicio 7.3 visible clases vecinas
    public String nombre; // Ejercicio 7.3 visible por todos
    private double saldo; // Ejercicio 7.3 solo visible por la clase
    private static String entidadBancaria = "BBVA"; // estatico porque es igual para toda la cuenta

    public void setEntidadBancaria(String entidadBancaria) { // asigna valor al atributo controlandolo
        this.entidadBancaria = entidadBancaria;
    }

    public String getEntidadBancaria() { // 7.4 devolver el asignado por el set
        return entidadBancaria;
    }

    public CuentaCorriente(String nombre, String DNI) { // Ejercicio 7.1
        this.nombre = nombre;
        this.DNI = DNI;
        saldo = 0;
    }

    public CuentaCorriente(String DNI, double saldo) { // Ejercicio 7.2 con DNI y saldo
        this(DNI, "Desconocido", saldo);
    }

    public CuentaCorriente(String dNI, String nombre, double saldo) { // Ejercicio 7.2 con DNI, nombre y saldow
        DNI = dNI;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public boolean sacarDinero(double dinero) {
        boolean retirarDinero;

        if (dinero <= saldo) {
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
        System.out.println("Banco " + entidadBancaria);
        System.out.println("DNI: " + DNI);
        System.out.println("Nombre propietario: " + nombre);
        System.out.println("Saldo: " + saldo + " euros\n");
        
    }
}
