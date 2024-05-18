package pruebadam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NotaAlumnado {

    private LocalDate fecha;
    private double valorGuardar;
    private static Map<Integer, NotaAlumnado> mapaNotas = new TreeMap<>();

    public NotaAlumnado(String fecha, double valorGuardar) {
        this.valorGuardar = valorGuardar;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = LocalDate.parse(fecha, f);
    }

    // usarlo en eliminar 
    public NotaAlumnado() {

    }

    public static boolean introducirNota(Integer nie, NotaAlumnado n) {
        boolean introducido = true;

        if (mapaNotas.containsValue(n)) {
            introducido = false;
        } else {
            mapaNotas.put(nie, n);
        }
        return introducido;
    }

    public static boolean eliminarTodasNotasAlumnado(Integer nie) {
        return mapaNotas.remove(nie) != null; // si devuelve null es false y si no es true

    }

    public static Set<Integer> codigosAlumnos() {
        Set<Integer> conjuntoCodigos = mapaNotas.keySet();

        return conjuntoCodigos;
    }

    public static Iterator<NotaAlumnado> notasAlumnado(Integer nie) {
        NotaAlumnado n1 = mapaNotas.get(nie);
        List<NotaAlumnado> listaNotas = new ArrayList<>();
        // pasado a lista para poder usar el iterador
        listaNotas.add(n1);

        if (listaNotas.isEmpty()) {
            return null;
        } else {
            Iterator< NotaAlumnado> iteradorNotas = listaNotas.iterator();
            return iteradorNotas;
        }

    }

    @Override
    public boolean equals(Object obj) {
        NotaAlumnado n = (NotaAlumnado) obj;

        return this.fecha.equals(n.fecha);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = LocalDate.parse(fecha, f);
    }

    public double getValorGuardar() {
        return valorGuardar;
    }

    public static Map<Integer, NotaAlumnado> getMapaNotas() {
        return mapaNotas;
    }

    public void setValorGuardar(double valorGuardar) {
        this.valorGuardar = valorGuardar;
    }

}
