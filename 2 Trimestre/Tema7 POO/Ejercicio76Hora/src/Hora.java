public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void mostrarHora(int horas, int minutos, int segundos, int n) {
        for (int recorrido = 0; recorrido <= n; recorrido++) {
            System.out.println("\n" + horas + ":" + minutos + ":" + segundos);
            segundos++;
            
            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 0;
                horas++;
            }
            if (horas == 24) {
                horas = 0;
            }
        }
    }
}
