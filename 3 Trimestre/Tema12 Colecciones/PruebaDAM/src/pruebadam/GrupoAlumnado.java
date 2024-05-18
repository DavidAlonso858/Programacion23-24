package pruebadam;

import java.util.ArrayList;
import java.util.List;

public class GrupoAlumnado {

    List<Alumnado> listaAlumnado = new ArrayList<>();

    public boolean inscribirAlumno(Alumnado alumnado) {
        if (listaAlumnado.contains(alumnado)) {
            return false;
        } else {
            return listaAlumnado.add(alumnado);
        }
    }

    public boolean eliminarAlumnado(Alumnado alumnado) {
        return listaAlumnado.remove(alumnado);
    }

    public boolean insertarNotaAlumnado(Integer nie, NotaAlumnado nota) {
        Alumnado a1 = encontrarPorNie(nie);

        if (a1 != null) {
            return nota.introducirNota(nie, nota);
        } else {
            return false;
        }
    }

    public Alumnado encontrarPorNie(Integer nie) {

        for (Alumnado alumnado : listaAlumnado) {
            if (alumnado.NIE.equals(nie)) {
                return alumnado;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "GrupoAlumnado{ " + listaAlumnado + '}';
    }

}
