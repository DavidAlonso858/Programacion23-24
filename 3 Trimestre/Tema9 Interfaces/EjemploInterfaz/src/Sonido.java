public interface Sonido {
    int version = 1; // atributo final y static por defecto en la interfaz

    public void voz(); // metodo abstracto

    default void vozDurmiendo() { // son public sin especificarlo
        System.out.println("Zzzz");
    }

    static void bostezo() { // metodo statico es public por defecto
        System.out.println("¡Aaaaaaauh!");
    }
}
// Las clases que implementen una interfaz tienen que implementar todos sus
// metodos

// Los metodos implementados tienen que declararse public

// Las interfaces no son instanciables y pueden que solo tengan atributos
