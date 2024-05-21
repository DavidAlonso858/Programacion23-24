package pruebadaw;

public class JefePolicia extends Policia {

    private static Integer contador = 1;

    public JefePolicia(String nombre) {
        super("J-" + Integer.toString(contador), nombre, 2750);
        contador++;
    }
}
