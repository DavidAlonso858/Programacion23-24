package pruebapooejercicio1;

import java.util.Arrays;

public class Inventario {

    private Producto[] tablaProductos;

    public Inventario() {
        this.tablaProductos = new Producto[0]; //no hay nada hasta que lo registre
    }

    public void actualizarVenta(Producto producto) {
        producto.setCantInventario(producto.getCantInventario() - 1);
    }

    public void actualizarCompra(Producto producto) {
        producto.setCantInventario(producto.getCantInventario() + 1);
    }

    public void añadirProductos(Producto producto) {
        int longitud = tablaProductos.length; // la original sin modificar
        tablaProductos = Arrays.copyOf(tablaProductos, longitud + 1);
        tablaProductos[tablaProductos.length - 1] = producto;
    }

    public void listarProductos() {

        System.out.println("Listado de Productos: " + Arrays.toString(tablaProductos));
    }
}
