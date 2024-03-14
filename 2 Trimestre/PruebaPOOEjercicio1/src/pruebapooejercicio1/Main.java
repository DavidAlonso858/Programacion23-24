package pruebapooejercicio1;

public class Main {

    public static void main(String[] args) {
        Producto pr1 = new Producto("Lentajas", "provenientes de Pakistan", 10.5, 5);
        Producto pr2 = new Producto("Macarrones", "provenientes de Yugoslavia", 1, 3);
        Inventario in1 = new Inventario();

        in1.añadirProductos(pr1);
        in1.añadirProductos(pr2);

        in1.actualizarCompra(pr2);
        in1.actualizarCompra(pr2);
        in1.actualizarCompra(pr2);
        System.out.println(pr2.getCantInventario()); // compruebo que se ha actualizado la cantidad de 3 a 6

        in1.listarProductos();
    }
}
