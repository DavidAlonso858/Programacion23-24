package df;

public class Motos extends Vehiculos {
    int cilidrada;

    public Motos(String marca, String modelo, String tipo, int cilidrada) {
        super(marca, modelo, tipo);
        this.cilidrada = cilidrada;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("La cilindrada es de " + cilidrada + "\n");
    }

}
