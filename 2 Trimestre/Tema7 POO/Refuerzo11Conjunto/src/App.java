public class App {
    public static void main(String[] args) {
        Conjunto Cj1 = new Conjunto();
        Conjunto Cj2 = new Conjunto();
        System.out.println("Numeros de elementos: "+Cj1.numElementos());
        Cj1.muestra();
        Cj1.insertar(4);
        Cj1.insertar(5);
       
        Cj1.muestra();
        
        Cj2.insertar(7);
        Cj1.insertar(Cj2);
        Cj1.muestra();
    }
}
