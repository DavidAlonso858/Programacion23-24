import java.util.Arrays;

public class Supercola implements Cola {
    private int[] cola1;
    private int[] cola2;

    public Supercola() {
        this.cola1 = new int[0];
        this.cola2 = new int[0];
    }

    public int[] getCola1() {
        return cola1;
    }

    public void setCola1(int[] cola1) {
        this.cola1 = cola1;
    }

    public int[] getCola2() {
        return cola2;
    }

    public void setCola2(int[] cola2) {
        this.cola2 = cola2;
    }

    @Override
    public int desencolar() {
        int aux = cola1[0];

        System.arraycopy(cola1, 1, cola1, 0, cola1.length - 1);
        cola1 = Arrays.copyOf(cola1, cola1.length - 1);

        return aux;
    }

    public void comprobar() {

        if (cola1.length == 0) {
            desencolar2();
        } else {
            desencolar();
        }
    }

    public void comprobar2() {

        if (cola2.length == 0) {
            desencolar();
        } else {
            desencolar2();
        }
    }

    @Override
    public int desencolar2() {
        int aux = cola2[0];

        System.arraycopy(cola2, 1, cola2, 0, cola2.length - 1);
        cola2 = Arrays.copyOf(cola2, cola2.length - 1);

        return aux;
    }

    @Override
    public void encolar(int n) {
        cola1 = Arrays.copyOf(cola1, cola1.length + 1);

        cola1[cola1.length - 1] = n;

    }

    @Override
    public void encolar2(int n) {
        cola2 = Arrays.copyOf(cola2, cola2.length + 1);

        cola2[cola2.length - 1] = n;

    }

    @Override
    public String toString() {
        return "Supercola [cola1=" + Arrays.toString(cola1) + ", cola2=" + Arrays.toString(cola2) + "]";
    }

}
