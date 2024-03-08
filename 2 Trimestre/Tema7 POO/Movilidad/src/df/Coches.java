package df;

public class Coches extends Vehiculos {
    int puertas;
    String color;
    int potencia;

    public Coches(String marca, String modelo, String tipo, int puertas, String color, int potencia) {
        super(marca, modelo, tipo);
        this.puertas = puertas;
        this.color = color;
        this.potencia = potencia;
    }

    @Override // to string añadiendo lo nuevo de esta clase a parte de la superclase
    public void mostrar() {
        super.mostrar();
        System.out.println("El numero de puertas es de: " + puertas);
        System.out.println("El color es: " + color);
        System.out.println("Tiene " + potencia + " caballos\n");
    }

}
