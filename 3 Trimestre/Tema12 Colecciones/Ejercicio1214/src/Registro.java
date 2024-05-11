import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Registro implements Serializable {
    private double temperatura;
    private LocalDate fecha;

    public Registro(double t) {
        this.temperatura = t;
        this.fecha = LocalDate.now();
    }

    @Override
    public boolean equals(Object obj) {
        return this.fecha.equals(((Registro) obj).fecha);
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        return "Registro [temperatura-> " + temperatura + " ºC" + ", fecha-> " + fecha.format(f) + "]\n";
    }

}
