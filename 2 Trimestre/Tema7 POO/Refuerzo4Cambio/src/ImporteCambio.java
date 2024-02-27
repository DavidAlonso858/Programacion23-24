public class ImporteCambio {
    private double[] euros = { 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01 };
    private final double precioProducto = 25;
    private double resultado;
    int cantidad;

    public void cambioPago(double pago) {
        if (pago >= precioProducto) {
            resultado = pago - precioProducto;

            for (double eu : euros) {
                if (resultado >= eu) {
                    cantidad = (int) (resultado / eu);
                    resultado %= eu;
                    System.out.println("Devolver " + cantidad + " billete(s) o moneda(s) de " + eu + " euros.");
                }
            }
        } else {
            System.out.println("Te falta dinero por pagar");
        }

    }

    public void mostrarPrecio() {
        System.out.println("El precio del producto es de " + precioProducto);
    }
}
