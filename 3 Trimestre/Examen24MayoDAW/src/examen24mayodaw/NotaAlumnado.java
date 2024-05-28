package examen24mayodaw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class NotaAlumnado {

    private String fecha;
    private double valorGuardar;
    private static Map<Integer, Set<NotaAlumnado>> mapaNotas = new TreeMap<>();

    public NotaAlumnado(String fecha, double valorGuardar) {
        this.fecha = fecha;
        if (valorGuardar < 0) {
            this.valorGuardar = 0;
        } else {
            this.valorGuardar = valorGuardar;
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getValorGuardar() {
        return valorGuardar;
    }

    public void setValorGuardar(double valorGuardar) {
        if (valorGuardar < 0) {
            this.valorGuardar = 0;
        } else {
            this.valorGuardar = valorGuardar;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.fecha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NotaAlumnado other = (NotaAlumnado) obj;
        return Objects.equals(this.fecha, other.fecha);
    }

    public static boolean introducirNota(Integer nie, NotaAlumnado n) {
        boolean introducido;

        if (!mapaNotas.containsKey(nie)) {
            mapaNotas.put(nie, new HashSet<>());
            introducido = mapaNotas.get(nie).add(n);
        } else {
            introducido = mapaNotas.get(nie).add(n);
        }

        return introducido;
    }

    public static boolean eliminarTodasNotasAlumnado(Integer nie) {
        return mapaNotas.remove(nie) != null;
    }

    public static Set<Integer> codigosAlumnado() {
        Set<Integer> claves = mapaNotas.keySet();

        return claves;
    }

    public static Iterator<NotaAlumnado> notasAlumnado(Integer nie) {
        if (!mapaNotas.containsKey(nie)) {
            return null;
        } else {
            Set<NotaAlumnado> conjuntoNotas = mapaNotas.get(nie);
            Iterator<NotaAlumnado> it = conjuntoNotas.iterator();

            return it;
        }
    }

    @Override
    public String toString() {
        return "NotaAlumnado{" + "fecha-> " + fecha + ", valorGuardar-> " + valorGuardar + '}';
    }

}
