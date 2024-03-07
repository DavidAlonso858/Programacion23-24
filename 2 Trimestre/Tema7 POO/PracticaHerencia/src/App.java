public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona("David", 21, 1.80);
        Empleado e1 = new Empleado("David", 21, "M", 2000);

        DiasSemana dia = DiasSemana.JUEVES; // asigno a una referencia algun valor de Enum
        System.out.println(dia + "\n");

        e1.mostrar();
    }
}
