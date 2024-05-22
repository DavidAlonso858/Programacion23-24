package pruebadaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ComisariaPolicia {

    List<Policia> listaPolicia;

    public ComisariaPolicia() {
        this.listaPolicia = new ArrayList<>();
    }

    public boolean insertarPolicia(Policia p) {
        boolean introducido = true;

        if (listaPolicia.contains(p)) {
            introducido = false;
        } else {
            introducido = listaPolicia.add(p);
        }
        return introducido;
    }

    public boolean eliminarPolicia(Policia p) {
        return listaPolicia.remove(p);
    }

    public boolean insertarMultaPolicia(String codigo, Multa m) {
        boolean introducido = false;

        for (Policia p : listaPolicia) {
            if (p instanceof PoliciaTransito && p.getCodigo().equals(codigo)) { // saber si es de esa clae y el codigo es el mismo
                return Multa.introducirMulta(codigo, m);
            }
        }
        return introducido;
    }

    public Policia encontrarPorCodigo(String codigo) {
        for (Policia p : listaPolicia) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public String toStringPoliciasYMultasOrdenadoPorCodigo() {
        String lista = "";
        Collections.sort(listaPolicia, (c1, c2) -> c1.getCodigo().compareTo(c2.getCodigo()));
        Set<String> listaPoliciasConMultas = Multa.policiasConMulta();
        
        for (Policia p : listaPolicia) {
            lista += p + "\n";
            if (listaPoliciasConMultas.contains(p.getCodigo())) {
                Iterator<Multa> it = Multa.multasPolicia(p.getCodigo());
                while (it.hasNext()) {
                    Multa m = it.next();
                    lista += m + "\n";
                }
            }
        }
        return lista;
    }

    public String toStringPoliciasOrdenadoPorNombre() {
        String lista = "";
        Collections.sort(listaPolicia, (c1, c2) -> c1.getNombre().compareTo(c2.getNombre()));

        lista = "Comisaria Policia ordenada por codigo: " + listaPolicia;
        return lista;
    }
}
