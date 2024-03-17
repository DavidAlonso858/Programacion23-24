public class App {
    public static void main(String[] args) {
        Unidad u1 = new Unidad();
        Caja cj1 = new Caja(50, 30, 20, u1);

        cj1.setEtiqueta();
        System.out.println("El volumen en m3: " + cj1.getVolumen());
        System.out.println(cj1.toString());

    }
}
