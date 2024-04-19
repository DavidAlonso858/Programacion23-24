package t9aplicacion11;

/**
 *
 * @author Rocio
 */
public class T9Aplicacion11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l = new Lista(10);
        Lista l2 = new Lista();
        
        l.insertarFinal("lluvia");
        l.insertarFinal("viaje");
        
        System.out.println(l);
        
        l2.insertarFinal("libros");
        l.insertarFinal(l2);
        System.out.println(l);
        //l.ordenar();
        System.out.println(l);

    }
    
}
