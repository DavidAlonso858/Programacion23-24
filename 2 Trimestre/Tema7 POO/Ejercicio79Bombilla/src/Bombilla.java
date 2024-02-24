public class Bombilla {
    private boolean bombilla;
    public static boolean interruptorGeneral; // en el main doy o no corriente

    public Bombilla() {
        this.bombilla = false; // apaga por defecto
    }

    public void enciende() {
        this.bombilla = true;
    }

    public void apaga() {
        this.bombilla = false;
    }

    public boolean comprobacion() {
        return interruptorGeneral && bombilla; // los dos deben comprobarse
    }

    public String revision() {
        return comprobacion() ? "Encendida" : "Apagada";
    }
}
