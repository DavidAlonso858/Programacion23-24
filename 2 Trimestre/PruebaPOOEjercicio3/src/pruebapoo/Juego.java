package pruebapoo;

import java.util.Arrays;

public class Juego {

    private int[] tablaPuntuaciones;

    public Juego() {
        this.tablaPuntuaciones = new int[0]; // la inicializo en 0 hasta que alguien añada
    }

    public void añadirPuntuaciones(Puntuacion puntuacion) {
        int longitud = tablaPuntuaciones.length; // la original sin modificar
        tablaPuntuaciones = Arrays.copyOf(tablaPuntuaciones, longitud + 1);
        tablaPuntuaciones[tablaPuntuaciones.length - 1] = puntuacion.getPuntuacion();
    }

    public void mostrarPuntuaciones() {

        for (int i = 0; i < tablaPuntuaciones.length; i++) { // ordenacion burbuja
            for (int j = 0; j < tablaPuntuaciones.length - 1 - i; j++) {
                if (tablaPuntuaciones[j] < tablaPuntuaciones[j + 1]) {
                    int aux = tablaPuntuaciones[j];
                    tablaPuntuaciones[j] = tablaPuntuaciones[j + 1];
                    tablaPuntuaciones[j + 1] = aux;
                }
            }
        }

        System.out.println("Ranking con todas las puntuaciones de los usuarios: " + Arrays.toString(tablaPuntuaciones));
    }
}
