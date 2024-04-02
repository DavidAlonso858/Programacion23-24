public class Zona {
    private int entradasPorVender;

    public Zona(int entradasPorVender) {
        this.entradasPorVender = entradasPorVender;
    }

    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    public void vender(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esa zona están agotadas.");
        } else if (this.entradasPorVender < n) {
            System.out.println("Sólo me quedan " + this.entradasPorVender

                    + " entradas para esa zona.");
        } else {
            entradasPorVender -= n;
            System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
        }
    }
}
