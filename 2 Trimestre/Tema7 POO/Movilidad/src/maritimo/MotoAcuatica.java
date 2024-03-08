package maritimo;

import df.Motos;

public class MotoAcuatica extends Motos {
    String tipoMotoAcuatica;
    int numeroPlazas;

    public MotoAcuatica(String marca, String modelo, String tipo, int cilidrada, String tipoMotoAcuatica,
            int numeroPlazas) {
        super(marca, modelo, tipo, cilidrada);
        this.tipoMotoAcuatica = tipoMotoAcuatica;

        if (numeroPlazas > 1 && numeroPlazas < 4) {
            this.numeroPlazas = numeroPlazas;
        } else if (numeroPlazas < 1) {
            this.numeroPlazas = 1;
        } else {
            this.numeroPlazas = 4;
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("La moto acuatica es " + tipoMotoAcuatica);
        System.out.println("Tiene  " + numeroPlazas + " plazas\n");
    }

}
