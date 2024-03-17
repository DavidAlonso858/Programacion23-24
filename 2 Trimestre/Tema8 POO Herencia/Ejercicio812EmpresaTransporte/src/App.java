public class App {
    public static void main(String[] args) {
        Unidad u1 = new Unidad();
        Caja cj1 = new Caja(50, 30, 20, u1);

        cj1.setEtiqueta();
        
        System.out.println(cj1.toString());

    }
}
