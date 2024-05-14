package refuerzo25mapasocio;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

}
