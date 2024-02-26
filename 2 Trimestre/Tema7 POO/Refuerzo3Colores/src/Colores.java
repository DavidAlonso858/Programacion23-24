import java.util.Arrays;

public class Colores {
    String[] colores = { "negro", "azul", "blanco", "verde", "gris", "morado" };
    String[] tablaDevolver;

    public void añadirColor(String colorNuevo) {
        colores = Arrays.copyOf(colores, colores.length + 1);
        colores[colores.length - 1] = colorNuevo;
    }

    public int aleatorio() {
        int num;

        num = (int) (Math.random() * (colores.length));

        return num;
    }

    public boolean noRepetir(String color) {
        boolean repetido = false;
        for (int i = 0; i < tablaDevolver.length; i++) {
            if (tablaDevolver[i] != null && tablaDevolver[i].equals(color)) { // no coincida el color con los lugares
                                                                              // rellenos
                repetido = true;
            }
        }
        return repetido;
    }

    public void tablaColoresNecesarios(int numColores) {
        tablaDevolver = new String[numColores];
        String colorAleatorio = "";
        for (int i = 0; i < tablaDevolver.length;) {
            colorAleatorio = colores[aleatorio()];
            if (i == 0) {
                tablaDevolver[i] = colorAleatorio;
                i++;
            } else {
                while (!noRepetir(colorAleatorio)) {
                    tablaDevolver[i] = colorAleatorio;
                    i++;
                }
            }
        }
        System.out.println("\nLos colores elegido al azar son -> " + Arrays.toString(tablaDevolver));
    }

    public void coloresDisponibles() {
        System.out.println("Colores disponibles -> " + Arrays.toString(colores));
    }
}