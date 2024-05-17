package prueba1;

public class Guerrero extends Personaje {

    public Guerrero() {
        nivelVida = 15; // al ser protected no hace falta declaralo aqui
        codigo = "2" + contador; // al ser protected no hace falta declaralo aqui
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
