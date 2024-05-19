package pruebadaw;

import java.util.Iterator;

public class PoliciaTransito extends Policia {

    public PoliciaTransito(String nombre) {
        super(nombre);
        this.codigo = "T-" + contador;
    }

    public double actualizarSueldo() {
        Double sumaImporte = 0.0;
        Iterator<Multa> it = Multa.multasPolicia(codigo);
        while (it.hasNext()) {
            Multa m = it.next();
            sumaImporte += m.getImporteMulta();
        }
        return this.sueldo += 0.10 * sumaImporte;
    }
}
