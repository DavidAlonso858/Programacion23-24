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
        int dano;
        boolean ejercitoVivo = false;

        dano = (int) (Math.random() * (11));
        guerreroAle = (int) (Math.random() * (ej.ejercito.length - 1));

        System.out.println(dano);
        System.out.println(guerreroAle);

        int vida = ejercito[guerreroAle].getNivelVida() - dano;

        ejercito[guerreroAle].setNivelVida(vida);

        for (int i = 0; i < ejercito.length - 1 && !ejercitoVivo; i++) {
            if (ejercito[i].getNivelVida() > 0) {
                ejercitoVivo = true;
            }
        }

        if (!ejercitoVivo) {
            if (ejercito[ejercito.length - 1].getNivelVida() > 0) {
                ejercito[ejercito.length - 1].setNivelVida(nivelVida - dano);
            } else {
                System.out.println("HAS GANADO");
            }
        }
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "Ejercito: " + Arrays.toString(ejercito);
        return cadena;
    }

}
