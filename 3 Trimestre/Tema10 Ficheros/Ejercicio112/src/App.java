import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) {
        String texto = """
                Con diez cañones por banda,
                viento en popa a toda vela,
                no corta el mar, sino vuela
                un velero bergantin.
                """; // las tres comillas respeta los saltos de linea
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cancionPirata.dat"))) {
            out.writeObject(texto); // escribimos el texto en el fichero
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
