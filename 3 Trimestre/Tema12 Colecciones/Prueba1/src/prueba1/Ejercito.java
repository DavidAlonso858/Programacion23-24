package prueba1;

import java.util.ArrayList;
import java.util.List;

public class Ejercito {

    private Integer numAleatorio;
    private List<Personaje> ej;

    public Ejercito() {
        this.numAleatorio = aleatorio(6, 3);
        ej = new ArrayList<>();
        
        if (ej.size()) {
            
        }
    }

    public Integer aleatorio(int limite, int limite2) {
        Integer aleatorio;

        limite = limite + 1;
        aleatorio = (int) (Math.random() * (limite - limite2) + limite2);

        return aleatorio;
    }
}
