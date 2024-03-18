public class App {
    public static void main(String[] args) {
        Unidad u1 = new Unidad();
        CajaCarton cc1 = new CajaCarton(50, 30, 20, u1);

        System.out.println("El volumen de la caja de carton es: "+cc1.getVolumen()+" cm");
        System.out.println("La superficie de cm: "+cc1.superficie());
        System.out.println(cc1.toString());

    }
}
