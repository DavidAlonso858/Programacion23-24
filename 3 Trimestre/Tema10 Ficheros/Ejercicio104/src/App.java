import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        BufferedReader in = null;
        String linea = "", numeros[];
        int sumaTotal = 0, media = 0;

        try {
            in = new BufferedReader(new FileReader("NumerosReales.txt"));
            linea = in.readLine();

            if (linea != null) { // if en vez de while ya que solo es una linea de texto
                numeros = linea.split(" "); // devuelve un array de String cuyo indice son los espacios
                for (int i = 0; i < numeros.length; i++) {
                    sumaTotal += Double.valueOf(numeros[i]); // devuelve el String como un Double
                }
                media = sumaTotal / numeros.length;

                System.out.println("Suma: " + sumaTotal);
                System.out.println("Media: " + media);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        }
        System.out.println(linea);
    }
}
