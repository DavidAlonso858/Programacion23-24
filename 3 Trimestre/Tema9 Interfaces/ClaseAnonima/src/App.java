public class App {
    public static void main(String[] args) {
        Sonido son = new Sonido() {
            
            @Override
            public void voz() {
                System.out.println("Yiiiih");
            }
        };
        son.voz();
    }
}
