public class Terminal {
    private String numero;
    private int segundos;

    public Terminal(String numero) {
        this.numero = numero;
        this.segundos = 0;
    }

    public void llama(Terminal t, int s) {
        this.segundos += s;
        t.segundos += s;
    }

    @Override
    public String toString() {
        return "Nº " + numero + " - " + segundos + "s de conversacion";
    }

}
