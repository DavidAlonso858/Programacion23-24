public class TarjetaRegalo {
    private double saldo;
    private int numeroTarjeta;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.numeroTarjeta = aleatorio();
    }

    public int aleatorio() {
        int num;

        num = (int) (Math.random() * (100000) + 10000);

        return num;
    }

    public void gasta(double n) {
        if (this.saldo < n) {
            System.out.println("No tienes suficiente dinero para gastar " + n);
        } else {
            this.saldo -= n;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TarjetaRegalo fusionCon(TarjetaRegalo t) {
        double saldoNuevo;
        saldoNuevo = this.saldo += t.saldo;
        this.setSaldo(0);
        t.setSaldo(0);
        return new TarjetaRegalo(saldoNuevo);
    }

    @Override
    public String toString() {
        return "TarjetaRegalo nº " + numeroTarjeta + " - Saldo " + saldo + " euros";
    }

}
