public class Movil extends Terminal {
    private double dineroTarifa;
    private String tarifa;

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.dineroTarifa = 0.00;
    }

    @Override
    public void llama(Terminal t, int numero) {
        super.llama(t, numero);
        double minuto = numero / 60;

        switch (this.tarifa) {
            case "rata":
                dineroTarifa += minuto * 0.06;
                break;
            case "mono":
                dineroTarifa += minuto * 0.12;
                break;
            case "bisonte":
                dineroTarifa += minuto * 0.30;
                break;
            default:
                System.out.println("No has elegido bien la tarifa");
                break;
        }

    }

    @Override
    public String toString() {
        return super.toString() + " - tarificados " + this.dineroTarifa + " euros";
    }

}
