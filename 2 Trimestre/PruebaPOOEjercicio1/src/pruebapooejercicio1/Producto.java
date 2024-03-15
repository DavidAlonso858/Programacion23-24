package pruebapooejercicio1;

public class Producto {

    private String nombreProducto;
    private String descripcionProducto;
    private double precio;
    private int cantInventario;

    public Producto(String nombreProducto, String descripcionProducto, double precio, int cantInventario) {
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
        this.cantInventario = cantInventario;
    }

    public void setCantInventario(int cantInventario) {
        this.cantInventario = cantInventario;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantInventario() {
        return cantInventario;
    }

    @Override
    public String toString() {
        return "Producto [nombreProducto=" + nombreProducto + ", descripcionProducto=" + descripcionProducto
                + ", precio=" + precio + ", cantInventario=" + cantInventario + "]";
    }

}
