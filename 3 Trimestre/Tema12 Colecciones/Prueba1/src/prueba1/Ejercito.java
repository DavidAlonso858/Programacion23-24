package prueba1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercito implements Serializable{

    private Integer numAleatorio;
    private List<Personaje> ej;

    public Ejercito() {
        this.numAleatorio = aleatorio(6, 3);
        ej = new ArrayList<>();

        for (int i = 0; i < numAleatorio; i++) {
            if (i == numAleatorio - 1) {
                ej.add(new Jefe());
            } else {
                ej.add(new Guerrero());
            }
        }
    }

    public Integer aleatorio(int limite, int limite2) {
        Integer aleatorio;

        limite += 1;
        aleatorio = (int) (Math.random() * (limite - limite2) + limite2);

        return aleatorio;
    }

    public boolean guerreroVivo(Ejercito ejercito) {
        boolean vivo = false;

        for (int i = 0; i < ejercito.ej.size() - 1 && !vivo; i++) {
            if (ejercito.ej.get(i).getNivelVida() > 0) {
                System.out.println(i);
                vivo = true;
            }
        }
        return vivo;
    }

    public boolean ejercitoVivo(Ejercito ejercito) {
        boolean vivo = false;
        Personaje ultimo = ejercito.ej.get(ejercito.ej.size() - 1);

        if (ultimo instanceof Jefe) { // se utiliza para verificar si es de ese objeto
            Jefe ultimoPersonaje = (Jefe) ultimo; // casteo para usar el vidaExtra

            if (ultimoPersonaje.getNivelVida() > 0 || ultimoPersonaje.getVidaExtra() > 0) {
                vivo = true;
            }
        }

        if (!vivo) {
            System.out.println("EL EJERCITO HA SIDO DERROTADO");
        }
        return vivo;
    }

    public void atacar(Ejercito ejercito) {
        Integer valorAtaque = aleatorio(10, 0);
        Integer daño = 0, posicionGuerrero;

        Personaje ultimo = ejercito.ej.get(ejercito.ej.size() - 1);

        if (guerreroVivo(ejercito)) { // ataca guerrero si hay alguno vivo
            posicionGuerrero = aleatorio((ejercito.ej.size() - 2), 0);
            System.out.println(posicionGuerrero);
            daño = ejercito.ej.get(posicionGuerrero).getNivelVida() - valorAtaque;
            System.out.println(daño + " y " + valorAtaque);

            ejercito.ej.get(posicionGuerrero).setNivelVida(daño);

        } else if (ejercitoVivo(ejercito)) { // ataca jefe si esta vivo
            if (ultimo instanceof Jefe) { // se utiliza para verificar si es de ese objeto
                Jefe ultimoPersonaje = (Jefe) ultimo; // casteo para usar el vidaExtra

                if (ultimoPersonaje.getNivelVida() > 0) {
                    daño = ultimoPersonaje.getNivelVida() - valorAtaque;
                    ultimoPersonaje.setNivelVida(daño);

                } else {
                    ultimoPersonaje.setVidaExtra(ultimoPersonaje.getVidaExtra() - valorAtaque);

                }
            }
        }
    }

    @Override
    public String toString() {
        return "{ " + ej + '}';
    }

}
