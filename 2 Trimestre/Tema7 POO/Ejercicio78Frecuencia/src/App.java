public class App {
    public static void main(String[] args) {
        Frecuencia f1 = new Frecuencia(107);
        Frecuencia f2 = new Frecuencia(90);
        f1.display();
        
        f1.up();
        f1.up();
        f1.up();
        f1.up();

        f1.display();

        System.out.println();
        f2.display();

        f2.down();
        f2.down();
        f2.down();
        f2.down();
        
        f2.display();
    }
}
