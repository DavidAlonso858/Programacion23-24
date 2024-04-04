public class Retangulo {
    private int base;
    private int altura;
    private static int rectangulosCreados = 0;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    @Override
    public String toString() {
        String cadena = "";

        for (int i = 1; i <= altura; i++) { // pasa de una linea a otra
            for (int j = 1; j <= base; j++) { // pinta en una linea el numero de la base
                cadena += "* ";
            }
            cadena += "\n";
        }
        return cadena;
    }
}
