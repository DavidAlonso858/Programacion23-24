public class App {
    public static void main(String[] args) {
        Pila p1 = new Pila();

        p1.apilar(8);
        p1.apilar(10);
        p1.apilar(12);

        System.out.println(p1.desapilar());

       System.out.println(p1.toString()); 
    }
}
