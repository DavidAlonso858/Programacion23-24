package pruebadaw;

import java.util.Iterator;

public class PoliciaTransito extends Policia {

    private static Integer contador = 1;

    public PoliciaTransito(String nombre) {
        super("T-" + Integer.toString(contador), nombre, 1750);
        contador++;
    }

    public double actualizarSueldo() {
        Double sumaImporte = 0.0;
        Iterator<Multa> it = Multa.multasPolicia(super.getCodigo()); // acordarse super
        while (it.hasNext()) {
            Multa m = it.next();
            sumaImporte += m.getImporteMulta();
        }

        Double sueldoNuevo = super.getSueldo() + 0.10 * sumaImporte;
        super.setSueldo(sueldoNuevo);
        return super.getSueldo();
    }
}
