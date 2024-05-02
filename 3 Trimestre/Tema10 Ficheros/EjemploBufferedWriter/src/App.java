import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String cadena = "En un lugar de la Mancha";

        try (BufferedWriter out = new BufferedWriter(new FileWriter("texto.txt"));) { // apertura con recursos
            for (int i = 0; i < cadena.length(); i++) {
                out.write(cadena.charAt(i)); // escribe en el fichero pasado en el out caracter a caracter de la linea
            }
            out.newLine(); // salto de linea

            cadena = "de cuyo nombre no quiero acordarme";
            out.write(cadena); // metodo que escribe la frase del tiron

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
