package examen24mayodaw;

import java.util.ArrayList;
import java.util.List;

public class GrupoAlumnado {

    private List<Alumnado> listaAlumnado;

    public GrupoAlumnado() {
        this.listaAlumnado = new ArrayList<>();
    }

    public boolean inscribirAlumnado(Alumnado alumnado) {
        boolean introducido = false;

        if (!listaAlumnado.contains(alumnado)) {
            introducido = listaAlumnado.add(alumnado);
        }

        return introducido;
    }

    public boolean eliminarAlumnado(Alumnado alumnado) {
        return listaAlumnado.remove(alumnado);
    }

    public boolean insertarNotaAlumnado(Integer nie, NotaAlumnado n) {
        Alumnado a1 = encontrarPorNie(nie);
        boolean introducido = false;

        if (a1 != null) {
            introducido = NotaAlumnado.introducirNota(nie, n);
        }
        
        return introducido;
    }

    public Alumnado encontrarPorNie(Integer nie) {
        for (Alumnado al : listaAlumnado) {
            if (al.getNIE().equals(nie)) {
                return al;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "GrupoAlumnado{ " + listaAlumnado + '}';
    }

}
