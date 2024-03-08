package maritimo;

import df.Vehiculos;

public class Yate extends Vehiculos {
    private int eslora;

    public Yate(String marca, String modelo, String tipo, int eslora) {
        super(marca, modelo, tipo);
        this.eslora = eslora;
    }

    public int getEslora() {
        return eslora;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("La eslora del Yate es de " + eslora);
    }

}
