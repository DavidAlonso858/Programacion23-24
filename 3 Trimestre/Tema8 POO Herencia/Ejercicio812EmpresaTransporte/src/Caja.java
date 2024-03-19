import java.util.Scanner;

public class Caja {
    Scanner sc = new Scanner(System.in);

    protected int ancho;
    protected int alto;
    protected int fondo;
    protected Unidad unidad;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) { // en cm
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public double getVolumen() { // pasar de cm a m3
        double volumen;

        volumen = fondo * ancho * alto;
        volumen = Math.pow(volumen, 3) / 1000000;

        return volumen;
    }

    public void setEtiqueta() {
        String nuevaEtiqueta;
        System.out.print("Introduce nueva etiqueta: ");
        nuevaEtiqueta = sc.nextLine();
        if (unidad.limitarCaracteres(nuevaEtiqueta)) { // si devuelve false te has pasado de 30 caracteres
            unidad.etiqueta = nuevaEtiqueta;
        } else {
            unidad.etiqueta = " ";
        }
    }

    @Override // uso toString con todos los atributos
    public String toString() {
        return "Caja [ancho= " + ancho + ", alto= " + alto + ", fondo= " + fondo + ", paquete= " + unidad.paquete
                + ", etiqueta= " + unidad.etiqueta + "]\n";
    }
}
