package pruebadaw;

public class JefePolicia extends Policia {

    public JefePolicia(String nombre) {
        super(nombre);
        this.codigo = "J-" + contador;
        this.sueldo += 1000;
    }

}
