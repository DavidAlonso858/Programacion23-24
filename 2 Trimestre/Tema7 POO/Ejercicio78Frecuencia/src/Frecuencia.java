public class Frecuencia {
    double frecuencia = 80;

    public Frecuencia(double frecuencia) {
        if (frecuencia >= 80 && frecuencia <= 108) {
            this.frecuencia = frecuencia;
        }
    }

    public void down() {
        frecuencia -= 0.5;
        if (frecuencia < 80) {
            frecuencia = 108;
        }
    }

    public void up() {
        frecuencia += 0.5;
        if (frecuencia > 108) {
            frecuencia = 80;
        }
    }

    public void display() {
        System.out.println("La frecuencia es de " + frecuencia + " MHz");
    }
}
