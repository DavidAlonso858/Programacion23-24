package df;

public class Vehiculos {
    protected String marca;
    protected String modelo;
    private String tipo;

    public Vehiculos(String marca, String modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public void mostrar() {
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        System.out.println("El tipo es: " + tipo + "\n");
    }
}
