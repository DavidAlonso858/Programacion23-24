package pruebadam;

import java.util.ArrayList;
import java.util.List;

public class GrupoAlumnado {

    List<Alumnado> listaAlumnado = new ArrayList<>();

    public boolean inscribirAlumno(Alumnado alumnado) {
        boolean introducido = false;

        if (!listaAlumnado.contains(alumnado)) {
            introducido = listaAlumnado.add(alumnado);
        }

        return introducido;
    }

    public boolean eliminarAlumnado(Alumnado alumnado) {
        return listaAlumnado.remove(alumnado);
    }

    public boolean insertarNotaAlumnado(Integer nie, NotaAlumnado nota) {
        Alumnado a1 = encontrarPorNie(nie);
        boolean introducido = false;

        if (a1 != null) {
            introducido = nota.introducirNota(nie, nota);
        }

        return introducido;
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
