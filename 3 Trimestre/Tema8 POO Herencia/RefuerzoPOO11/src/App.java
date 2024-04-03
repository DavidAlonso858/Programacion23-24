public class App {
    public static void main(String[] args) {
        TarjetaRegalo t1 = new TarjetaRegalo(100);
        TarjetaRegalo t2 = new TarjetaRegalo(200);

        System.out.println(t1);
        System.out.println(t2);

        t1.gasta(60);
        t2.gasta(210);
        
        System.out.println(t1);
        TarjetaRegalo t3 = t1.fusionCon(t2);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
