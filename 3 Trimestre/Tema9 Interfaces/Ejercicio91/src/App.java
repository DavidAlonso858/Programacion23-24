public class App {
    public static void main(String[] args) {
        ListaPrueba l = new ListaPrueba();

        l.encolar(10);
        l.encolar(3);
        l.encolar(2);
        l.encolar(1);
        System.out.println(l.desencolar());
        System.out.println(l.desencolar());

        System.out.println(l);
    }
}
