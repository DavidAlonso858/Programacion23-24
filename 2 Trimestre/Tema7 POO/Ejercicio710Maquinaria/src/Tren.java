public class Tren {
    Locomotora locomotora;
    Vagon vagones[];
    Maquinista responsableMaquinista;
    private int numVagones;

    public Tren(Locomotora locomotora, Maquinista responsableMaquinista) {
        this.locomotora = locomotora;
        this.responsableMaquinista = responsableMaquinista;
        vagones = new Vagon[5];
        numVagones = 0;
    }

    public void enganchaVagon(int cargaMax, int cargaActual, String mercancia) {
        if (numVagones >= 5) {
            System.out.println("El tren no admite mas vagones");
        } else {
            Vagon v = new Vagon(numVagones, cargaMax, cargaActual, mercancia);
            vagones[numVagones] = v;
            numVagones++;
        }
    }
}
