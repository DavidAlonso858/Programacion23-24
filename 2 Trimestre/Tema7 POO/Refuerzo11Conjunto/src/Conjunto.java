public class Conjunto {
    private int[] Conjunto;

    public Conjunto() {
        this.Conjunto = new int[5];

    }

    public int numElementos() {
        int elementos = Conjunto.length;

        return elementos;
    }

    public boolean insertar(int nuevo) {
        boolean insertado = false;
        for (int i = 0; i < Conjunto.length && !insertado; i++) {
            if (Conjunto[i] == 0) {
                Conjunto[i] = nuevo;
                insertado = true;
            }
        }
        return insertado;
    }

    public boolean insertar(Conjunto otroConjunto) {
        boolean insertado = false;
        int longitud = numElementos() * 2;
        this.Conjunto = new int[longitud];
        int indice = 0;

        for (int i = 0; i < numElementos(); i++) {
            Conjunto[indice++] = Conjunto[i];
        }

        for (int i = 0; i < otroConjunto.numElementos(); i++) {
            Conjunto[indice++] = otroConjunto.Conjunto[i];
        }

        if (indice > 0) {
            insertado = true;
        }
        return insertado;
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
        System.out.print("]\n");
    }
}
