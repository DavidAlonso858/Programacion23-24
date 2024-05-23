package flota1;

import embarcaciones1.Barco;
import embarcaciones1.Submarino;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Flota {

    private Set<Barco> conjuntoFlota = new LinkedHashSet<>();
    private Integer maximo = 10;

    public int numeroBarcos() {
        return conjuntoFlota.size();
    }

    public boolean insertarBarco(Barco b) {
        boolean insertado = false;
        if (numeroBarcos() < maximo) {
            insertado = conjuntoFlota.add(b);
        }
        return insertado;
    }

    public boolean eliminarBarco(Barco b) {
        return conjuntoFlota.remove(b);
    }

    public int longitudPeriscopioFlota() {
        Integer sumatotal = 0;

        for (Barco barco : conjuntoFlota) {
            if (barco instanceof Submarino) {
                Submarino sub = (Submarino) barco;
                sumatotal += sub.getPeriscopio().intValue();
            }
        }

        return sumatotal;
    }

    public boolean recibirAtauqe() {
        Double min = Double.MAX_VALUE;
        Barco barcoMinimo = null;

        for (Barco barco : conjuntoFlota) {
            if (barco.getLongitud() < min) {
                min = barco.getLongitud();
                barcoMinimo = barco;
            }
        }

        return conjuntoFlota.remove(barcoMinimo);
    }

    public ArrayList<Barco> listadoBarcos() {
        ArrayList<Barco> listaFlota = new ArrayList<>(conjuntoFlota);

        return listaFlota;
    }

}
