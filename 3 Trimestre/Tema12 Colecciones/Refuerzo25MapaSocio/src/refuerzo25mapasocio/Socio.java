package refuerzo25mapasocio;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Socio implements Serializable {
    private String apodo;
    private String nombre;
    private LocalDate fechaIngreso;

    public Socio(String apodo, String nombre, String fechaIngreso) {
        this.apodo = apodo;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaIngreso = LocalDate.parse(fechaIngreso, f);
    }

    public Socio(String nombre) { // constructor para trabajar en modi
        this.nombre = nombre;
    }

    public Socio(String apodo, String fechaIngreso) { // constructor para trabajar en modi
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaIngreso = LocalDate.parse(fechaIngreso, f);
    }

    public int antiguedad() {
        int antiguedad;
        // desde la ingresada hasta ahora en años
        antiguedad = (int) this.fechaIngreso.until(LocalDate.now(), ChronoUnit.YEARS);

        return antiguedad;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaIngreso(String fechaIngreso) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaIngreso = LocalDate.parse(fechaIngreso, f);
    }

    public String getApodo() {
        return apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        return " Socio [apodo-> " + apodo + ", nombre->" + nombre + ", fechaIngreso->" + f.format(fechaIngreso) + " ]";
    }

}
