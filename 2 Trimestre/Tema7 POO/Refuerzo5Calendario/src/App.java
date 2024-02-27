public class App {
    public static void main(String[] args) {
        Calendario c1 = new Calendario(2023, 12, 20);
        Calendario c2 = new Calendario(2034, 1, 21);

        c1.mostrar();
        
        c1.incrementarDia();
        c1.incrementarMes();
        c1.incrementarAño(10);
        System.out.println(c1.iguales(c2));

        c1.mostrar();
    }
}
