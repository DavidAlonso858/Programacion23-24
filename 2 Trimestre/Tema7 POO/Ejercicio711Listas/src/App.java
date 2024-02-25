public class App {
    public static void main(String[] args) {
        Lista l1 = new Lista();
        Lista l2 = new Lista();

        l1.insertarNumeroFinal(10);
        l1.insertarNumeroFinal(5);
        l1.insertarNumeroFinal(2);
        l1.mostrar();
        l1.insertarNumeroPrincipio(1);
        l1.mostrar();
    }
}
