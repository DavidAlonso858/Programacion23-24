import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RegistroTemperatura implements Serializable {
    double temperatura;
    LocalDateTime fechaHora;

    public RegistroTemperatura(double temperatura) {
        this.temperatura = temperatura;
        this.fechaHora = LocalDateTime.now();

    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        return "Registro [ temperatura-> " + temperatura + " ºC," + " fechaHora-> " + f.format(fechaHora) + " ]\n";
    }
}
