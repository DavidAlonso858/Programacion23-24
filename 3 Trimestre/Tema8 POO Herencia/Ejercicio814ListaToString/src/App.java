public class App {
    public static void main(String[] args) {
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        
        l1.insertarFinal(10);
        l1.insertarFinal(9);
        l1.insertarFinal(2);
        l1.insertarPrincipio(1);
    
        l2.insertarFinal(10);
        l2.insertarFinal(9);
        l2.insertarFinal(2);
        l2.insertarPrincipio(1);
        
        System.out.println(l1.equals(l2));
        System.out.println(l1.toString());
    }
}
