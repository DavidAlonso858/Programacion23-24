public class Conjunto {
    private int[] Conjunto;

    public Conjunto() {
        this.Conjunto = new int[5];
    }

    public int numElementos() {
        int elementos = Conjunto.length;

        return elementos;
    }









    
    public void muestra() {
        System.out.print("Conjunto mostrado: ");
        System.out.print("[");
        for (int i = 0; i < Conjunto.length; i++) {
            if (i == Conjunto.length - 1) {
                System.out.print(Conjunto[i]);
            } else {
                System.out.print(Conjunto[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
