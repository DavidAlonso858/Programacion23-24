import java.util.Arrays;

public abstract class Instrumento {
    Notas[] melodia;

    public Instrumento() {
        melodia = new Notas[0];
    }

    public void añadirNota(Notas n1) { // añadimos la nueva introducida
        int longi = melodia.length;
        melodia = Arrays.copyOf(melodia, longi + 1);
        melodia[melodia.length - 1] = n1;
    }

    public abstract void interpretar(); // para implementar el metodo en las subclases (clase abstracta)

}
