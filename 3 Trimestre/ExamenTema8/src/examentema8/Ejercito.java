package examentema8;

import java.util.Arrays;

public class Ejercito extends Personaje {

    private int numero;
    private Personaje[] ejercito;

    public Ejercito() {
        numero = (int) (Math.random() * (7 - 3) + 3);
        ejercito = new Personaje[numero];
        for (int i = 0; i < ejercito.length - 1; i++) {
            ejercito[i] = new Guerrero();
        }
        ejercito[ejercito.length - 1] = new Jefe();
    }

    public void atacar(Ejercito ej) {
        int guerreroAle;

        guerreroAle = (int) (Math.random() * (ej.ejercito.length - 1));
        
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "Ejercito: " + Arrays.toString(ejercito);
        return cadena;
    }

}
