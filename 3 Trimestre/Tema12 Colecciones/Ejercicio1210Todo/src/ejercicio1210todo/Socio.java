package ejercicio1210todo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Socio implements Serializable, Comparable<Socio> {
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;

    public Socio(String dni, String nombre, String fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaAlta = LocalDate.parse(fechaAlta, f);
    }

    @Override
    public int compareTo(Socio o) {

        return this.dni.compareTo(o.dni);
    }

    public int antiguedad() {
        int antiguedad = (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);

        return antiguedad;
    }

    @Override
    public boolean equals(Object obj) {
        Socio s = (Socio) obj;

        return this.dni.equals(s.dni);
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        return "\nSocio [dni-> " + this.dni + ", nombre-> " + nombre + ", fechaAlta->" + f.format(fechaAlta) + "]";
    }

}
