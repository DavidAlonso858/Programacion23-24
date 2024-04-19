import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable {
    int id;
    String nombre;
    LocalDate fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f); // le paso el formato

    }

    public int edad() {
        int edad = (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS); // desde ahora hasta la fecha de
                                                                                   // nacimientos en años
        return edad;
    }

    @Override
    public int compareTo(Object o) {
        Socio nuevo = (Socio) o; // casteamos el objeto a la clase que queremos

        int res;

        res = edad() - nuevo.edad(); // comparando si la edad del actual es mayor, menor o igual que el nuevo
        return res;
    }

    @Override
    public String toString() {
        return "Socio [id=" + id + ", nombre=" + nombre + ", edad()=" + edad()
                + "]";
    }

}
