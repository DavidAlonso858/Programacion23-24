public class Terminal {
    private String numero;
    private int conver;

    public Terminal(String numero) {
        if (numero.length() != 12) {
            System.out.println("El numero de la terminal debe tener 9 numeros");
        } else {
            this.numero = numero;
        }
        this.conver = 0;
    }

    public void llama(Terminal t, int numero) {
        this.conver += numero;
        t.conver += numero;
    }

    @Override
    public String toString() {
        return "\nNº " + this.numero + " - " + this.conver + "s de conversacion";
    }

}
