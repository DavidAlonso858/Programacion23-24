public class Piramide {
    private int altura;
    private static int piramidesCreadas = 0;

    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        String cadena = "";
        // inserta espacios
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                cadena += "  ";
            }
            // pinta la línea
            for (int x = 1; x < i * 2; x++) { // menor o igual que la i del primer bucle
                cadena += "* ";
            }
            cadena += "\n";
        }
        return cadena;
    }
}