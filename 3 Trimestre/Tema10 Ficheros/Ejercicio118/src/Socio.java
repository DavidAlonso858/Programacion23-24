import java.io.Serializable;

public class Socio implements Serializable { // implements Serializable para convertirlo en fichero en la otra clase
    String dni;
    String nombre;

    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Socio { dni-> " + dni + ", nombre-> " + nombre + " }";
    }

}
