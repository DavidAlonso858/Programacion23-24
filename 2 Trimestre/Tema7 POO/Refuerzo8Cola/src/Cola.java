public class Cola {
    public int[] Cola;

    public Cola(int colaLong) {
        this.Cola = new int[colaLong];
        for (int i = 0; i < this.Cola.length; i++) {
            this.Cola[i] = i + 1;
        }
    }

    public void colocarNuevo() {

        int ultimo = Cola[Cola.length - 1] + 1, temporal;
        for (int i = 0; i < Cola.length - 1; i++) {
            temporal = Cola[i + 1];
            Cola[i] = temporal;
        }
        Cola[Cola.length - 1] = ultimo;
    }

    public void mostrar() {
        // System.out.println("Orden de la cola" + Arrays.toString(Cola));
        System.out.print("Orden de la cola: ");
        System.out.print("[");
        for (int i = 0; i < Cola.length; i++) {
            if (i == Cola.length - 1) {
                System.out.print(Cola[i]);
            } else {
                System.out.print(Cola[i] + ", ");
            }
        }
        System.out.print("]\n");
    }
}
